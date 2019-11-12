/*
 * DeleteMeTest.java
 *
 * Created on 2019-11-08, 14:27
 */
package io.fabric8.kubernetes.client;

import org.junit.Test;

import java.nio.file.FileSystems;

/**
 * Created by Marc Nuri <marc@marcnuri.com> on 2019-11-08.
 */
public class DeleteMeTest {

  @Test
  public void test() throws Exception {
    final KubernetesClient kc = new DefaultKubernetesClient();
//    final List<Pod> pods =  kc.pods().list().getItems();
//    pods.stream().forEach(System.out::println);
//    kc.pods().withName("fabric8-maven-sample-spring-boot-1-kttwt")
//      .file("/tmp/deleteTest.txt")
//      .upload(FileSystems.getDefault().getPath("C:\\", "Users", "Marc", "Downloads", "delete", "test.txt"));
//    kc.pods().withName("fabric8-maven-sample-spring-boot-1-kttwt")
//      .file("/tmp/zapas.jpg")
//      .upload(FileSystems.getDefault().getPath("C:\\", "Users", "Marc", "Downloads", "delete", "zapas.jpg"));

    kc.pods().withName("fabric8-maven-sample-spring-boot-1-kttwt")
      .file("/tmp/OpenSSH-Win64.zip")
      .upload(FileSystems.getDefault()
        .getPath("C:\\", "Users", "Marc", "Downloads", "delete", "OpenSSH-Win64.zip"), 262144);

    kc.pods().withName("fabric8-maven-sample-spring-boot-1-kttwt")
      .file("/tmp/zapas.jpg")
      .copy(FileSystems.getDefault()
        .getPath("C:\\", "Users", "Marc", "Downloads", "delete", "zapasDownload.jpg"));

    kc.services().list();
  }
}
