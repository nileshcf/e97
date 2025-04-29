package com.cloudframe.app.vsammon1.file.records;

/**
*  The class MonPriKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:31. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class MonPriKey extends MonPriKeySerialized { 
   
				@Getter @Setter private MonXcdtTskStrtDt monXcdtTskStrtDt = new MonXcdtTskStrtDt();

						@Getter @Setter private char[] monXcdtTskStrtTm = Field.fillLowValue(8);

						@Getter @Setter private char[] monXcdtProgNm = Field.fillLowValue(8);

						@Getter @Setter private char[] monXcdtMthdNm = Field.fillLowValue(35);

								@Getter @Setter private int monXctorTskNo;
	
	/**
	* Constructor for MonPriKey
	**/
    public MonPriKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MonPriKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MonPriKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getMonXcdtTskStrtDt().setParent(this,getStartOffset() + 0);
    } 

	/**
	 * 	initializes MonPriKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getMonXcdtTskStrtDt().initialize();
     
         setMonXcdtTskStrtTm(CONSTANTS.SPACE_8);
         setMonXcdtProgNm(CONSTANTS.SPACE_8);
         setMonXcdtMthdNm(CONSTANTS.SPACE_35);
                     setMonXctorTskNo(0);
   }


}
  
