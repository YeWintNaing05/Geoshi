package com.aungkyawpaing.geoshi.model

data class LineString(
  val coordinates: List<Position>
) : Geometry() {

  override fun getType(): GeometryType = GeometryType.LINESTRING

}
