package com.cloudframe.app.init1.dto;

/**
*  The class AiypInit is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class AiypInit extends AiypInitSerialized { 
   

								@Getter @Setter private int filler8;

				@Getter @Setter private AiypPriorTbl aiypPriorTbl = new AiypPriorTbl();
	
	/**
	* Constructor for AiypInit
	**/
    public AiypInit() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AiypInit. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AiypInit(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getAiypPriorTbl().setParent(this,getStartOffset() + 8);
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 4
             ,4
             );
    } 

	/**
	 * 	initializes AiypInit
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getAiypPriorTbl().initialize();
     
   }


}
  
