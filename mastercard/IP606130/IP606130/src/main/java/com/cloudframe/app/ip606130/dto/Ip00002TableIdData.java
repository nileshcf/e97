package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip00002TableIdData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip00002TableIdData extends Ip00002TableIdDataSerialized { 
   

						@Getter @Setter private char[] ip00002TableIdInfo = Field.fillLowValue(8);

								@Getter @Setter private long ip00002TableKeyLngth;

						@Getter @Setter private char[] ip00002TblSubId = Field.fillLowValue(3);
	
	/**
	* Constructor for Ip00002TableIdData
	**/
    public Ip00002TableIdData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00002TableIdData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00002TableIdData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
