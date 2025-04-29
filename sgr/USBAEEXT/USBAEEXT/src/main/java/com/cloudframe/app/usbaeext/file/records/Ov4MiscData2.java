package com.cloudframe.app.usbaeext.file.records;

/**
*  The class Ov4MiscData2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


@Data
public class Ov4MiscData2 extends Ov4MiscData2Serialized { 
   


								@Getter @Setter private long ov4Md2CrAcct;


						@Getter @Setter private char[] ov4Md2CrTc = Field.fillLowValue(5);

								@Getter @Setter private BigDecimal ov4Md2CrAmt = BigDecimal.ZERO;
	
	/**
	* Constructor for Ov4MiscData2
	**/
    public Ov4MiscData2() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ov4MiscData2. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ov4MiscData2(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 8
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 22
             ,2
             );
    } 



}
  
