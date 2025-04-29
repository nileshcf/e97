package com.cloudframe.app.init1.dto;

/**
*  The class IypInit8 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class IypInit8 extends IypInit8Serialized { 
   


				@Getter @Setter private IypPriorTbl8 iypPriorTbl8 = new IypPriorTbl8();
	
	/**
	* Constructor for IypInit8
	**/
    public IypInit8() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for IypInit8. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IypInit8(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIypPriorTbl8().setParent(this,getStartOffset() + 24);
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 20
             ,4
             );
    } 

	/**
	 * 	initializes IypInit8
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIypPriorTbl8().initialize();
     
   }


}
  
