/*
 * Copyright 2005-2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.sf.dozer.vo;

/**
 * @author garsombke.franz
 * @author sullins.ben
 * @author tierney.matt
 */
public class LoopObjectChildPrime extends BaseTestObject {
  private LoopObjectParentPrime parent;

  public LoopObjectParentPrime getParent() {
    return parent;
  }

  public void setParent(LoopObjectParentPrime parent) {
    this.parent = parent;
  }

  @Override
  public int hashCode() {
    return System.identityHashCode(this);
  }

  @Override
  public String toString() {
    return this.getClass().getName() + "@" + Integer.toHexString(hashCode());
  }

  @Override
  public boolean equals(Object obj) {
    return hashCode() == obj.hashCode();
  }
}
