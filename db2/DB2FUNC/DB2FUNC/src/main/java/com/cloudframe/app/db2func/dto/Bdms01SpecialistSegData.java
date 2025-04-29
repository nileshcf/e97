package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01SpecialistSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Bdms01SpecialistSegData extends Bdms01SpecialistSegDataSerialized { 
   

								@Getter @Setter private int bdms01SpecialistSegSqlcd;

								@Getter @Setter private long msdSpecAcctBbbaaaaat;
				@Getter @Setter private MsdSpecialistAcctNo msdSpecialistAcctNo = new MsdSpecialistAcctNo();

						@Getter @Setter private char[] msdSpecAcctCkdg = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01SpecExchangeCd = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01SpecClientNbr = Field.fillLowValue(4);

	
	/**
	* Constructor for Bdms01SpecialistSegData
	**/
    public Bdms01SpecialistSegData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01SpecialistSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01SpecialistSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getMsdSpecialistAcctNo().setParent(this,getStartOffset() + 4);
    } 

	/**
	 * 	initializes Bdms01SpecialistSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01SpecialistSegSqlcd(0);
                     setMsdSpecAcctBbbaaaaat(0);
         setMsdSpecAcctCkdg(CONSTANTS.SPACE);
         setBdms01SpecExchangeCd(CONSTANTS.SPACE_10);
         setBdms01SpecClientNbr(CONSTANTS.SPACE_4);
   }


}
  
