/*
 * Licensed to the Apache Software Foundation (ASF) under one   *
 * or more contributor license agreements.  See the NOTICE file *
 * distributed with this work for additional information        *
 * regarding copyright ownership.  The ASF licenses this file   *
 * to you under the Apache License, Version 2.0 (the            *
 * "License"); you may not use this file except in compliance   *
 * with the License.  You may obtain a copy of the License at   *
 *                                                              *
 *   http://www.apache.org/licenses/LICENSE-2.0                 *
 *                                                              *
 * Unless required by applicable law or agreed to in writing,   *
 * software distributed under the License is distributed on an  *
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY       *
 * KIND, either express or implied.  See the License for the    *
 * specific language governing permissions and limitations      *
 * under the License.                                           *
 */
package org.apache.rat.analysis.license;

import org.apache.rat.api.MetaData;

/**
 * License matches AGPL3 or later.
 */
public class OpenBSDLicense extends FullTextMatchingLicense {
    public static final String FIRST_LICENSE_LINE = "Permission to use, copy, modify, and distribute this software for any\n" +
            " purpose with or without fee is hereby granted, provided that the above\n" +
            " copyright notice and this permission notice appear in all copies.";

    public OpenBSDLicense() {
        super(MetaData.RAT_LICENSE_FAMILY_CATEGORY_DATUM_BSD,
                MetaData.RAT_LICENSE_FAMILY_NAME_DATUM_BSD,
                "", FIRST_LICENSE_LINE);
    }
}
