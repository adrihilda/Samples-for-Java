/*
* Copyright (c) 2012 Research In Motion Limited.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package nfc.sample.virtual.target;

public interface Constants {

    public static final String MYAPP_VERSION = "1.0.7";
    public static final String MY_ISO_TARGET_ID = "1213141"; // length 4, 7 or 10 by NFC specification
    public static final int DISPLAY_COLUMN_WIDTH = 8;

    public static final int SC_BTN_STATE=0;
    public static final int SR_BTN_STATE=0;
    
    public static final int EMULATE_SC=0;
    public static final int EMULATE_SR=1;
}