package com.cloudframe.app.ar640010.dto;

/**
*  The class StsOutputParm250 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class StsOutputParm250 extends StsOutputParm250Serialized { 
   

						@Getter @Setter private char[] gftStatCd250 = new char[1];

						@Getter @Setter private char[] hubStatCd250 = new char[2];

						@Getter @Setter private char[] e2eStatCd250 = new char[2];

						@Getter @Setter private char[] statRefAbbrTxt250 = new char[14];

						@Getter @Setter private char[] statRefDesc250 = new char[80];

						@Getter @Setter private char[] stsLstUpdtUid250 = new char[9];

						@Getter @Setter private char[] stsLstUpdtTs250 = new char[26];
	
	/**
	* Constructor for StsOutputParm250
	**/
    public StsOutputParm250() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for StsOutputParm250. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public StsOutputParm250(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setGftStatCd250(fillSpace(1));
								setHubStatCd250(fillSpace(2));
								setE2eStatCd250(fillSpace(2));
								setStatRefAbbrTxt250(fillSpace(14));
								setStatRefDesc250(pad(80," ".toCharArray(),' ',RIGHT_PAD));
								setStsLstUpdtUid250(fillSpace(9));
								setStsLstUpdtTs250(fillSpace(26));
    } 

	/**
	 * 	initializes StsOutputParm250
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setGftStatCd250(CONSTANTS.SPACE);
         setHubStatCd250(CONSTANTS.SPACE_2);
         setE2eStatCd250(CONSTANTS.SPACE_2);
         setStatRefAbbrTxt250(CONSTANTS.SPACE_14);
         setStatRefDesc250(CONSTANTS.SPACE_80);
         setStsLstUpdtUid250(CONSTANTS.SPACE_9);
         setStsLstUpdtTs250(CONSTANTS.SPACE_26);
   }


}
  
