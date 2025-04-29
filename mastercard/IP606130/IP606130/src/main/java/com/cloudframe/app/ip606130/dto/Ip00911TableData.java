package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip00911TableData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip00911TableData extends Ip00911TableDataSerialized { 
   

								@Getter @Setter private long ip00911BsBin;

						@Getter @Setter private char[] ip00911BsBinBusSrvLvl = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00911BsBinBusSrvId = Field.fillLowValue(6);

						@Getter @Setter private char[] ip00911BsBinAccBrand = Field.fillLowValue(3);

								@Getter @Setter private int ip00911BsBinBsPriority;

						@Getter @Setter private char[] ip00911BsBinLifecylInd = Field.fillLowValue(1);

								@Getter @Setter private int ip00911MemberFiller;
				@Getter @Setter private Ip00911CentralSiteFields ip00911CentralSiteFields = new Ip00911CentralSiteFields();
	
	/**
	* Constructor for Ip00911TableData
	**/
    public Ip00911TableData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00911TableData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00911TableData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp00911CentralSiteFields().setParent(this,getStartOffset() + 22);
    } 

	/**
	 * 	initializes Ip00911TableData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp00911BsBin(0);
         setIp00911BsBinBusSrvLvl(CONSTANTS.SPACE);
         setIp00911BsBinBusSrvId(CONSTANTS.SPACE_6);
         setIp00911BsBinAccBrand(CONSTANTS.SPACE_3);
                     setIp00911BsBinBsPriority(0);
         setIp00911BsBinLifecylInd(CONSTANTS.SPACE);
                     setIp00911MemberFiller(0);
          getIp00911CentralSiteFields().initialize();
     
   }


}
  
