package com.cloudframe.app.init1.dto;

/**
*  The class IypInit7 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class IypInit7 extends IypInit7Serialized { 
   


				@Getter @Setter private IypPriorTbl7 iypPriorTbl7 = new IypPriorTbl7();
	
	/**
	* Constructor for IypInit7
	**/
    public IypInit7() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for IypInit7. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IypInit7(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIypPriorTbl7().setParent(this,getStartOffset() + 24);
       replaceValue( // serialize and save the value
             fillSpace(20)
             , getStartOffset() + 0
             ,20
             );
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 20
             ,4
             );
    } 

	/**
	 * 	initializes IypInit7
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIypPriorTbl7().initialize();
     
   }


}
  
