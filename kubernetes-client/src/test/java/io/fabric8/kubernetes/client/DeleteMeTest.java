/*
 * DeleteMeTest.java
 *
 * Created on 2019-11-08, 14:27
 */
package io.fabric8.kubernetes.client;

import java.nio.file.FileSystems;
import java.util.List;

import io.fabric8.kubernetes.api.model.Pod;
import org.junit.Test;

/**
 * Created by Marc Nuri <marc@marcnuri.com> on 2019-11-08.
 */
public class DeleteMeTest {
  @Test
  public void test() throws Exception {
    final KubernetesClient kc = new DefaultKubernetesClient();
    final List<Pod> pods =  kc.pods().list().getItems();
//    kc.pods().withName("").file("").copy("/tmp");
    kc.pods().withName("fabric8-maven-sample-spring-boot-1-kttwt")
      .file("/tmp/zapas.jpg")
      .copy(FileSystems.getDefault().getPath("C:\\", "Users", "Marc", "Downloads", "delete", "zapas"));

    kc.services().list();
  }
}
