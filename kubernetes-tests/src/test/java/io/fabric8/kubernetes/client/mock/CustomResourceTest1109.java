package io.fabric8.kubernetes.client.mock;

import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinition;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionBuilder;
import io.fabric8.kubernetes.client.dsl.MixedOperation;
import io.fabric8.kubernetes.client.dsl.Resource;
import io.fabric8.kubernetes.client.mock.crd.DoneableFooBar;
import io.fabric8.kubernetes.client.mock.crd.FooBar;
import io.fabric8.kubernetes.client.mock.crd.FooBarList;
import io.fabric8.kubernetes.client.server.mock.KubernetesServer;
import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.migrationsupport.rules.EnableRuleMigrationSupport;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

@EnableRuleMigrationSupport
public class CustomResourceTest1109 {
  @Rule
  public KubernetesServer server = new KubernetesServer(true,true);

  private CustomResourceDefinition customResourceDefinition;

  @BeforeEach
  void setUp() {
    customResourceDefinition = server.getClient().customResourceDefinitions().create(new CustomResourceDefinitionBuilder()
      .withNewMetadata()
      .withName("foo-bar.baz.example.com")
      .endMetadata()
      .withNewSpec()
      .withGroup("baz.example.com")
      .withVersion("v1alpha1")
      .withScope("Namespaced")
      .withNewNames()
      .withKind("FooBar")
      .withPlural("foo-bars")
      .withSingular("foo-bar")
      .endNames()
      .endSpec()
      .build());
  }

  @Test
  public void test1109() {
    final MixedOperation<FooBar, FooBarList, DoneableFooBar, Resource<FooBar, DoneableFooBar>> fooBarClient =
      server.getClient().customResources(customResourceDefinition, FooBar.class, FooBarList.class, DoneableFooBar.class);
    final FooBar fb1 = new FooBar();
    fb1.getMetadata().setName("example");
    fooBarClient.inNamespace("default").create(fb1);
    final FooBarList list = fooBarClient.inNamespace("default").list();
    assertEquals(1, list.getItems().size());
    assertEquals("FooBar", list.getItems().iterator().next().getKind());
    final FooBar fooBar = fooBarClient.inNamespace("default").withName("example").get();
    assertNull(fooBar); //TODO -> Should be not null -> assertNotNull
  }
}
