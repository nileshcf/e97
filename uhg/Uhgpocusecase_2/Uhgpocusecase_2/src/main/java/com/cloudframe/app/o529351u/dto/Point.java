package com.cloudframe.app.o529351u.dto;

/**
*  The class Point is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Point extends PointSerialized { 
   

								@Getter @Setter private int point1;

								@Getter @Setter private int point2;

								@Getter @Setter private int point3;

								@Getter @Setter private int point4;
	
	/**
	* Constructor for Point
	**/
    public Point() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Point. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Point(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
