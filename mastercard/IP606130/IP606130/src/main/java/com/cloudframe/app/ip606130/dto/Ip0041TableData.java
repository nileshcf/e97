package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip0041TableData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip0041TableData extends Ip0041TableDataSerialized { 
   

								@Getter @Setter private long ip0041Bin;

						@Getter @Setter private char[] ip0041Ab = Field.fillLowValue(3);

								@Getter @Setter private long ip0041Ica;

						@Getter @Setter private char[] ip0041FormatIndicator = Field.fillLowValue(1);

								@Getter @Setter private long ip0041Endpoint;

						@Getter @Setter private char[] ip0041PosMvInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0041AtmMvInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0041UcafInd = Field.fillLowValue(1);
				@Getter @Setter private Ip0041RegionTable ip0041RegionTable = new Ip0041RegionTable();
				@Getter @Setter private Ip0041CountryTable ip0041CountryTable = new Ip0041CountryTable();

						@Getter @Setter private char[] ip0041RePowerInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0041DomDbtParticipSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0041IchgAcqCd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0041MemberFiller = Field.fillLowValue(5);
				@Getter @Setter private Ip0041CentralSiteFields ip0041CentralSiteFields = new Ip0041CentralSiteFields();
	
	/**
	* Constructor for Ip0041TableData
	**/
    public Ip0041TableData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip0041TableData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0041TableData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp0041RegionTable().setParent(this,getStartOffset() + 31);
					getIp0041CountryTable().setParent(this,getStartOffset() + 37);
					getIp0041CentralSiteFields().setParent(this,getStartOffset() + 105);
    } 

	/**
	 * 	initializes Ip0041TableData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp0041Bin(0);
         setIp0041Ab(CONSTANTS.SPACE_3);
                     setIp0041Ica(0);
         setIp0041FormatIndicator(CONSTANTS.SPACE);
                     setIp0041Endpoint(0);
         setIp0041PosMvInd(CONSTANTS.SPACE);
         setIp0041AtmMvInd(CONSTANTS.SPACE);
         setIp0041UcafInd(CONSTANTS.SPACE);
          getIp0041RegionTable().initialize();
     
          getIp0041CountryTable().initialize();
     
         setIp0041RePowerInd(CONSTANTS.SPACE);
         setIp0041DomDbtParticipSw(CONSTANTS.SPACE);
         setIp0041IchgAcqCd(CONSTANTS.SPACE);
         setIp0041MemberFiller(CONSTANTS.SPACE_5);
          getIp0041CentralSiteFields().initialize();
     
   }


}
  
