/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.flume.channel.file;

public class FileChannelConfiguration {
  /**
   * Directory Checkpoints will be written in
   */
  public static final String CHECKPOINT_DIR = "checkpointDir";
  /**
   * Directories data files will be written in. Multiple directories
   * can be specified as comma separated values. Writes will
   * be written in a round robin fashion.
   */
  public static final String DATA_DIRS = "dataDirs";
  /**
   * Maximum number of put/take events in a transaction. Default: 1000
   */
  public static final String TRANSACTION_CAPACITY = "transactionCapacity";
  public static final int DEFAULT_TRANSACTION_CAPACITY = 1000;
  /**
   * Interval at which checkpoints should be taken. Default 5 mins (ms)
   */
  public static final String CHECKPOINT_INTERVAL = "checkpointInterval";
  public static final long DEFAULT_CHECKPOINT_INTERVAL = 5L * 60L * 1000L;
  /**
   * Max file size for data files, cannot exceed the default. Default: 2GB
   */
  public static final String MAX_FILE_SIZE = "maxFileSize";
  public static final long DEFAULT_MAX_FILE_SIZE = LogFile.MAX_FILE_SIZE;
  /**
   * Maximum capacity of the channel. This number needs to be configured
   * in line with -XX:MaxDirectMemorySize. {@link FileChannel}
   * Default: 1,000,000 which will consume 8MB of direct memory
   */
  public static final String CAPACITY = "capacity";
  public static final int DEFAULT_CAPACITY = 1000000;
  /**
   * The length of time we will wait for space available to do a Put.
   * Default: 3 (seconds)
   */
  public static final String KEEP_ALIVE = "keep-alive";
  public static final int DEFAULT_KEEP_ALIVE = 3;
}
