package com.cloudframe.app.alltype.dto;

/**
*  The class GroupWithValue is used to handle fields declared in it
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
public class GroupWithValue extends GroupWithValueSerialized { 
   

								@Getter @Setter private short bBinarySign1;

								@Getter @Setter private int bBinarySign2;

								@Getter @Setter private long bBinarySign3;

								@Getter @Setter private int bBinaryUnsign1;

								@Getter @Setter private long bBinaryUnsign2;

								@Getter @Setter private long bBinaryUnsign3;

								@Getter @Setter private short bDisplaySign1;

								@Getter @Setter private int bDisplaySign2;

								@Getter @Setter private long bDisplaySign3;

								@Getter @Setter private int bDisplayUnsign1;

								@Getter @Setter private long bDisplayUnsign2;

								@Getter @Setter private long bDisplayUnsign3;

								@Getter @Setter private short bPackedSign1;

								@Getter @Setter private int bPackedSign2;

								@Getter @Setter private long bPackedSign3;

								@Getter @Setter private int bPackedUnsign1;

								@Getter @Setter private long bPackedUnsign2;

								@Getter @Setter private long bPackedUnsign3;

								@Getter @Setter private BigDecimal bDecBinarySign1 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal bDecBinarySign2 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal bDecBinarySign3 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal bDecBinaryUnsign1 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal bDecBinaryUnsign2 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal bDecBinaryUnsign3 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal bDecDisplaySign1 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal bDecDisplaySign2 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal bDecDisplaySign3 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal bDecDisplayUnsign1 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal bDecDisplayUnsign2 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal bDecDisplayUnsign3 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal bDecPackedSign1 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal bDecPackedSign2 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal bDecPackedSign3 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal bDecPackedUnsign1 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal bDecPackedUnsign2 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal bDecPackedUnsign3 = BigDecimal.ZERO;

						@Getter @Setter private char[] bChar = new char[5];

						@Getter @Setter private char[] bCharJustRight = new char[5];

								@Getter @Setter private char[] bCharZero = new char[5];
							
	
	/**
	* Constructor for GroupWithValue
	**/
    public GroupWithValue() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for GroupWithValue. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public GroupWithValue(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setBBinarySign1((short)1);
								setBBinarySign2(1);
								setBBinarySign3(1L);
								setBBinaryUnsign1(1);
								setBBinaryUnsign2(1L);
								setBBinaryUnsign3(1L);
								setBDisplaySign1((short)1);
								setBDisplaySign2(1);
								setBDisplaySign3(1L);
								setBDisplayUnsign1(1);
								setBDisplayUnsign2(1L);
								setBDisplayUnsign3(1L);
								setBPackedSign1((short)1);
								setBPackedSign2(1);
								setBPackedSign3(1L);
								setBPackedUnsign1(1);
								setBPackedUnsign2(1L);
								setBPackedUnsign3(1L);
								setBDecBinarySign1(BigDecimal.valueOf(1).setScale(2));
								setBDecBinarySign2(BigDecimal.valueOf(1).setScale(7));
								setBDecBinarySign3(BigDecimal.valueOf(1).setScale(9));
								setBDecBinaryUnsign1(BigDecimal.valueOf(1).setScale(2));
								setBDecBinaryUnsign2(BigDecimal.valueOf(1).setScale(6));
								setBDecBinaryUnsign3(BigDecimal.valueOf(1).setScale(9));
								setBDecDisplaySign1(BigDecimal.valueOf(1).setScale(2));
								setBDecDisplaySign2(BigDecimal.valueOf(1).setScale(7));
								setBDecDisplaySign3(BigDecimal.valueOf(1).setScale(9));
								setBDecDisplayUnsign1(BigDecimal.valueOf(1).setScale(2));
								setBDecDisplayUnsign2(BigDecimal.valueOf(1).setScale(6));
								setBDecDisplayUnsign3(BigDecimal.valueOf(1).setScale(9));
								setBDecPackedSign1(BigDecimal.valueOf(1).setScale(2));
								setBDecPackedSign2(BigDecimal.valueOf(1).setScale(7));
								setBDecPackedSign3(BigDecimal.valueOf(1).setScale(9));
								setBDecPackedUnsign1(BigDecimal.valueOf(1).setScale(2));
								setBDecPackedUnsign2(BigDecimal.valueOf(1).setScale(6));
								setBDecPackedUnsign3(BigDecimal.valueOf(1).setScale(9));
								setBChar(("1    ").toCharArray());
								setBCharJustRight(("1    ").toCharArray());
								setBCharZero(("1    ").toCharArray());
    } 

	/**
	 * 	initializes GroupWithValue
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setBBinarySign1((short)0);
                     setBBinarySign2(0);
                     setBBinarySign3(0);
                     setBBinaryUnsign1(0);
                     setBBinaryUnsign2(0);
                     setBBinaryUnsign3(0);
         	setBDisplaySign1((short)0);
                     setBDisplaySign2(0);
                     setBDisplaySign3(0);
                     setBDisplayUnsign1(0);
                     setBDisplayUnsign2(0);
                     setBDisplayUnsign3(0);
         	setBPackedSign1((short)0);
                     setBPackedSign2(0);
                     setBPackedSign3(0);
                     setBPackedUnsign1(0);
                     setBPackedUnsign2(0);
                     setBPackedUnsign3(0);
			setBDecBinarySign1(BigDecimal.ZERO);
			setBDecBinarySign2(BigDecimal.ZERO);
			setBDecBinarySign3(BigDecimal.ZERO);
			setBDecBinaryUnsign1(BigDecimal.ZERO);
			setBDecBinaryUnsign2(BigDecimal.ZERO);
			setBDecBinaryUnsign3(BigDecimal.ZERO);
			setBDecDisplaySign1(BigDecimal.ZERO);
			setBDecDisplaySign2(BigDecimal.ZERO);
			setBDecDisplaySign3(BigDecimal.ZERO);
			setBDecDisplayUnsign1(BigDecimal.ZERO);
			setBDecDisplayUnsign2(BigDecimal.ZERO);
			setBDecDisplayUnsign3(BigDecimal.ZERO);
			setBDecPackedSign1(BigDecimal.ZERO);
			setBDecPackedSign2(BigDecimal.ZERO);
			setBDecPackedSign3(BigDecimal.ZERO);
			setBDecPackedUnsign1(BigDecimal.ZERO);
			setBDecPackedUnsign2(BigDecimal.ZERO);
			setBDecPackedUnsign3(BigDecimal.ZERO);
         setBChar(CONSTANTS.SPACE_5);
         setBCharJustRight(CONSTANTS.SPACE_5);
                    setBCharZero(CONSTANTS.SPACE_5);
   }


}
  
