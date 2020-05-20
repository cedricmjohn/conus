package org.carbonateresearch.conus.grids

import org.carbonateresearch.conus.common.CalculationParametersIOLabels

case class AllCells (variableName:CalculationParametersIOLabels, value:List[Any]) extends GridValueDescriptor {
  def setOfValues:List[List[(Any,Seq[Int])]] = List(value.map(v => (v,Seq())))
}

object AllCells {
  def apply(variable:CalculationParametersIOLabels,value:Any): AllCells = AllCells(variable,List(value))
}