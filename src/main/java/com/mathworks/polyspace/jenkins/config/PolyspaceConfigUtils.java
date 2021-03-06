// Copyright (c) 2019 The MathWorks, Inc.
// All Rights Reserved.
// 
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
// 
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
// 
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.

package com.mathworks.polyspace.jenkins.config;

import hudson.util.FormValidation;
import org.apache.commons.lang3.StringUtils;

public final class PolyspaceConfigUtils {
  public static FormValidation doCheckProtocol( String value) {
    if (!(value.equals("http") || value.equals("https"))) {
      return FormValidation.error("Protocol must be http or https");
    }
    return FormValidation.ok();
  }

  public static FormValidation doCheckPort(String value) {
    if (StringUtils.isNumeric(value)) {
      return FormValidation.ok();
    }
    return FormValidation.error("Port must be a number");
  }
}
