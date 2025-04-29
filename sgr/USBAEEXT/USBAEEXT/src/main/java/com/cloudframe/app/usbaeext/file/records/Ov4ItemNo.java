package com.cloudframe.app.usbaeext.file.records;

/**
*  The class Ov4ItemNo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ov4ItemNo extends Ov4ItemNoSerialized { 
   

								@Getter @Setter private int ov4InJulYear;

								@Getter @Setter private int ov4InJulDay;

								@Getter @Setter private int ov4InBatch;

								@Getter @Setter private int ov4InSeqInBat;
	
	/**
	* Constructor for Ov4ItemNo
	**/
    public Ov4ItemNo() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ov4ItemNo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ov4ItemNo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
