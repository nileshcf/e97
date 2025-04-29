package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip38201AllocateParms is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip38201AllocateParms extends Ip38201AllocateParmsSerialized { 
   

						@Getter @Setter private char[] ip38201InputOutputFileInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip38201StorageMedia = Field.fillLowValue(1);

						@Getter @Setter private char[] ip38201TapeLabelType = Field.fillLowValue(3);

								@Getter @Setter private long ip38201TapeSequenceNumber;

						@Getter @Setter private char[] ip38201DiskVolSer = Field.fillLowValue(6);
				@Getter @Setter private Ip38201SpaceParms ip38201SpaceParms = new Ip38201SpaceParms();
				@Getter @Setter private Ip38201DcbInfo ip38201DcbInfo = new Ip38201DcbInfo();

						@Getter @Setter private char[] ip38201EnvironmentIndicator = Field.fillLowValue(4);

						@Getter @Setter private char[] ip38201BulkType = Field.fillLowValue(4);

						@Getter @Setter private char[] ip38201ClearingIdentifier = Field.fillLowValue(5);

						@Getter @Setter private char[] ip38201DsnThirdQualifier = Field.fillLowValue(4);
	
	/**
	* Constructor for Ip38201AllocateParms
	**/
    public Ip38201AllocateParms() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip38201AllocateParms. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip38201AllocateParms(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp38201SpaceParms().setParent(this,getStartOffset() + 11);
					getIp38201DcbInfo().setParent(this,getStartOffset() + 23);
    } 

	/**
	 * 	initializes Ip38201AllocateParms
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp38201InputOutputFileInd(CONSTANTS.SPACE);
         setIp38201StorageMedia(CONSTANTS.SPACE);
         setIp38201TapeLabelType(CONSTANTS.SPACE_3);
                     setIp38201TapeSequenceNumber(0);
          getIp38201SpaceParms().initialize();
     
          getIp38201DcbInfo().initialize();
     
         setIp38201EnvironmentIndicator(CONSTANTS.SPACE_4);
         setIp38201BulkType(CONSTANTS.SPACE_4);
         setIp38201ClearingIdentifier(CONSTANTS.SPACE_5);
         setIp38201DsnThirdQualifier(CONSTANTS.SPACE_4);
   }


}
  
