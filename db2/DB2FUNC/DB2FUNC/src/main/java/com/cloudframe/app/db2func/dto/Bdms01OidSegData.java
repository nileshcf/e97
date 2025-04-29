package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01OidSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Bdms01OidSegData extends Bdms01OidSegDataSerialized { 
   

								@Getter @Setter private int bdms01OidSegSqlcd;
				@Getter @Setter private MsdOidDateCcyymmdd msdOidDateCcyymmdd = new MsdOidDateCcyymmdd();

								@Getter @Setter private BigDecimal msdOidIssuePrc = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal msdOidAccrtdValue = BigDecimal.ZERO;

						@Getter @Setter private char[] bdms01OidDt = Field.fillLowValue(10);

	
	/**
	* Constructor for Bdms01OidSegData
	**/
    public Bdms01OidSegData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01OidSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01OidSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getMsdOidDateCcyymmdd().setParent(this,getStartOffset() + 4);
    } 

	/**
	 * 	initializes Bdms01OidSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01OidSegSqlcd(0);
          getMsdOidDateCcyymmdd().initialize();
     
			setMsdOidIssuePrc(BigDecimal.ZERO);
			setMsdOidAccrtdValue(BigDecimal.ZERO);
         setBdms01OidDt(CONSTANTS.SPACE_10);
   }


}
  
