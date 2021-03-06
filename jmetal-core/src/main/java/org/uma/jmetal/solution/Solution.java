//  This program is free software: you can redistribute it and/or modify
//  it under the terms of the GNU Lesser General Public License as published by
//  the Free Software Foundation, either version 3 of the License, or
//  (at your option) any later version.
//
//  This program is distributed in the hope that it will be useful,
//  but WITHOUT ANY WARRANTY; without even the implied warranty of
//  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//  GNU Lesser General Public License for more details.
//
//  You should have received a copy of the GNU Lesser General Public License
//  along with this program.  If not, see <http://www.gnu.org/licenses/>.

package org.uma.jmetal.solution;

import java.io.Serializable;

/**
 * Interface representing a Solution
 * @author Antonio J. Nebro
 * @version 0.1
 * @param <T> Type (Double, Integer, etc.)
 */
public interface Solution<T> extends Serializable {
  public void setObjective(int index, double value) ;
  public double getObjective(int index) ;

  public T getVariableValue(int index) ;
  public void setVariableValue(int index, T value) ;
  public String getVariableValueString(int index) ;

  public int getNumberOfVariables() ;
  public int getNumberOfObjectives() ;

  public double getOverallConstraintViolationDegree() ;
  public void setOverallConstraintViolationDegree(double violationDegree) ;

  public int getNumberOfViolatedConstraints() ;
  public void setNumberOfViolatedConstraints(int numberOfViolatedConstraints) ;

  public Solution copy() ;

  public void setAttribute(Object id, Object value) ;
  public Object getAttribute(Object id) ;
}
