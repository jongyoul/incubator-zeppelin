/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.zeppelin.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.IOException;
import org.junit.Test;

public class EncryptorTest {

  @Test
  public void testEncryption() throws IOException {
    Encryptor encryptor = new Encryptor("foobar1234567890");

    String input = "test";

    String encrypted = encryptor.encrypt(input);
    assertNotEquals(input, encrypted);

    String decrypted = encryptor.decrypt(encrypted);
    assertEquals(input, decrypted);
  }
}
