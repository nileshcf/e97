package com.cloudframe.app.alltype.dto;

/**
*  The class GroupWith88 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:44. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class GroupWith88 extends GroupWith88Serialized { 
   

								@Getter @Setter private short cBinarySign1;

								@Getter @Setter private int cBinarySign2;

								@Getter @Setter private long cBinarySign3;

								@Getter @Setter private int cBinaryUnsign1;

								@Getter @Setter private long cBinaryUnsign2;

								@Getter @Setter private long cBinaryUnsign3;

								@Getter @Setter private short cDisplaySign1;

								@Getter @Setter private int cDisplaySign2;

								@Getter @Setter private long cDisplaySign3;

								@Getter @Setter private int cDisplayUnsign1;

								@Getter @Setter private long cDisplayUnsign2;

								@Getter @Setter private long cDisplayUnsign3;

								@Getter @Setter private short cPackedSign1;

								@Getter @Setter private int cPackedUnsign1;

								@Getter @Setter private BigDecimal cDecBinarySign1 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal cDecBinaryUnsign1 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal cDecDisplaySign1 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal cDecDisplayUnsign1 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal cDecPackedSign1 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal cDecPackedUnsign1 = BigDecimal.ZERO;

						@Getter @Setter private char[] cChar = new char[5];

						@Getter @Setter private char[] cCharJustRight = new char[5];

						@Getter @Setter private char[] cCharZero9 = Field.fillLowValue(5);

								@Getter @Setter private char[] cCharZero0 = Field.fillLowValue(5);

								@Getter @Setter private char[] cCharZero = new char[5];
							
	
	/**
	* Constructor for GroupWith88
	**/
    public GroupWith88() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for GroupWith88. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public GroupWith88(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setCBinarySign1((short)1);
								setCBinarySign2(1);
								setCBinarySign3(1L);
								setCBinaryUnsign1(1);
								setCBinaryUnsign2(1L);
								setCBinaryUnsign3(1L);
								setCDisplaySign1((short)1);
								setCDisplaySign2(1);
								setCDisplaySign3(1L);
								setCDisplayUnsign1(1);
								setCDisplayUnsign2(1L);
								setCDisplayUnsign3(1L);
								setCPackedSign1((short)1);
								setCPackedUnsign1(1);
								setCDecBinarySign1(BigDecimal.valueOf(1).setScale(2));
								setCDecBinaryUnsign1(BigDecimal.valueOf(1).setScale(2));
								setCDecDisplaySign1(BigDecimal.valueOf(1).setScale(2));
								setCDecDisplayUnsign1(BigDecimal.valueOf(1).setScale(2));
								setCDecPackedSign1(BigDecimal.valueOf(1).setScale(2));
								setCDecPackedUnsign1(BigDecimal.valueOf(1).setScale(2));
								setCChar(("1    ").toCharArray());
								setCCharJustRight(("1    ").toCharArray());
								setCCharZero(("00011").toCharArray());
    } 

	/**
	 * 	initializes GroupWith88
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setCBinarySign1((short)0);
                     setCBinarySign2(0);
                     setCBinarySign3(0);
                     setCBinaryUnsign1(0);
                     setCBinaryUnsign2(0);
                     setCBinaryUnsign3(0);
         	setCDisplaySign1((short)0);
                     setCDisplaySign2(0);
                     setCDisplaySign3(0);
                     setCDisplayUnsign1(0);
                     setCDisplayUnsign2(0);
                     setCDisplayUnsign3(0);
         	setCPackedSign1((short)0);
                     setCPackedUnsign1(0);
			setCDecBinarySign1(BigDecimal.ZERO);
			setCDecBinaryUnsign1(BigDecimal.ZERO);
			setCDecDisplaySign1(BigDecimal.ZERO);
			setCDecDisplayUnsign1(BigDecimal.ZERO);
			setCDecPackedSign1(BigDecimal.ZERO);
			setCDecPackedUnsign1(BigDecimal.ZERO);
         setCChar(CONSTANTS.SPACE_5);
         setCCharJustRight(CONSTANTS.SPACE_5);
         setCCharZero9(CONSTANTS.SPACE_5);
                    setCCharZero(CONSTANTS.SPACE_5);
   }


}
  
