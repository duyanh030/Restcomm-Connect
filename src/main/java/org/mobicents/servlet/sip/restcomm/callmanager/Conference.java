/*
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.mobicents.servlet.sip.restcomm.callmanager;

/**
 * @author quintana.thomas@gmail.com (Thomas Quintana)
 */
public interface Conference {
  public void addCall(Call call);
  public String getName();
  public void removeCall(Call call);
  
  public enum Status {
    INIT("init"),
    IN_PROGRESS("in-progress"),
    COMPLETED("completed"),
    FAILED("failed");
    
    private final String text;
    
    private Status(final String text) {
      this.text = text;
    }
    
    public static Status getValueOf(final String text) throws IllegalArgumentException {
      final Status[] values = values();
      for(final Status value : values) {
        if(value.toString().equals(text)) {
          return value;
        }
      }
      throw new IllegalArgumentException(text + " is not a valid status.");
    }
    
    @Override public String toString() {
      return text;
    }
  }
}
