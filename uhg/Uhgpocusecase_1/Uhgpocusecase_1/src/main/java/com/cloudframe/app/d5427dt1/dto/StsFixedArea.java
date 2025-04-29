package com.cloudframe.app.d5427dt1.dto;

/**
*  The class StsFixedArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class StsFixedArea extends StsFixedAreaSerialized { 
   

						@Getter @Setter private char[] stsRespProgramName = Field.fillLowValue(8);

						@Getter @Setter private char[] stsRespCode = Field.fillLowValue(4);
				@Getter @Setter private StsResponseVars stsResponseVars = new StsResponseVars();
				@Getter @Setter private StsDsmCommonArea stsDsmCommonArea = new StsDsmCommonArea();
	
	/**
	* Constructor for StsFixedArea
	**/
    public StsFixedArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for StsFixedArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public StsFixedArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getStsResponseVars().setParent(this,getStartOffset() + 12);
					getStsDsmCommonArea().setParent(this,getStartOffset() + 310);
    } 

	/**
	 * 	initializes StsFixedArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setStsRespProgramName(CONSTANTS.SPACE_8);
         setStsRespCode(CONSTANTS.SPACE_4);
          getStsResponseVars().initialize();
     
          getStsDsmCommonArea().initialize();
     
   }


}
  
