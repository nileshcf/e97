package com.cloudframe.app.move0.dto;

/**
*  The class Rl7abTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Rl7abTbl extends Rl7abTblSerialized { 
   

								@Getter @Setter private int dpFeatId;

								@Getter @Setter private long dpMonthlyAllowAmt;

						@Getter @Setter private char[] dpMonthlyAllowTxt = new char[40];

						@Getter @Setter private char[] dpMonthlyUnldInd = new char[1];

								@Getter @Setter private int dpAllowOffrId;

						@Getter @Setter private char[] dpAlwPerClassId = new char[2];

								@Getter @Setter private BigDecimal dpPerUnitChg1a = BigDecimal.ZERO;

						@Getter @Setter private char[] dpPerUnitChgTxt1a = new char[15];

								@Getter @Setter private BigDecimal dpPerUnitChg1b = BigDecimal.ZERO;

						@Getter @Setter private char[] dpPerUnitChgTxt1b = new char[15];

						@Getter @Setter private char[] dpFeatUnitDescr = new char[20];
	
	/**
	* Constructor for Rl7abTbl
	**/
    public Rl7abTbl() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Rl7abTbl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rl7abTbl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setDpFeatId(111);
								setDpMonthlyAllowAmt(222L);
								setDpMonthlyAllowTxt(String.join("", java.util.Collections.nCopies(40, "3")).toCharArray());
								setDpMonthlyUnldInd(("4").toCharArray());
								setDpAllowOffrId(555);
								setDpAlwPerClassId(("66").toCharArray());
								setDpPerUnitChg1a(BigDecimal.valueOf(777).setScale(11));
								setDpPerUnitChgTxt1a(String.join("", java.util.Collections.nCopies(15, "8")).toCharArray());
								setDpPerUnitChg1b(BigDecimal.valueOf(999).setScale(11));
								setDpPerUnitChgTxt1b(String.join("", java.util.Collections.nCopies(15, "A")).toCharArray());
								setDpFeatUnitDescr(String.join("", java.util.Collections.nCopies(20, "B")).toCharArray());
    } 

	/**
	 * 	initializes Rl7abTbl
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setDpFeatId(0);
                     setDpMonthlyAllowAmt(0);
         setDpMonthlyAllowTxt(CONSTANTS.SPACE_40);
         setDpMonthlyUnldInd(CONSTANTS.SPACE);
                     setDpAllowOffrId(0);
         setDpAlwPerClassId(CONSTANTS.SPACE_2);
			setDpPerUnitChg1a(BigDecimal.ZERO);
         setDpPerUnitChgTxt1a(CONSTANTS.SPACE_15);
			setDpPerUnitChg1b(BigDecimal.ZERO);
         setDpPerUnitChgTxt1b(CONSTANTS.SPACE_15);
         setDpFeatUnitDescr(CONSTANTS.SPACE_20);
   }


}
  
