package com.cloudframe.app.bm80022.file.records;

/**
*  The class Ge0018f is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ge0018f extends Ge0018fSerialized {
   

						@Getter @Setter private char[] ge0018fCodentid = Field.fillLowValue(2);

						@Getter @Setter private char[] ge0018fTipproduct = Field.fillLowValue(3);

								@Getter @Setter private long ge0018fCodcontrat;

								@Getter @Setter private int ge0018fOfigestora;

						@Getter @Setter private char[] ge0018fIdepsig = Field.fillLowValue(12);

								@Getter @Setter private int ge0018fNumpersona;

								@Getter @Setter private long ge0018fNumcartera;

						@Getter @Setter private char[] ge0018fCodcartera = Field.fillLowValue(8);

						@Getter @Setter private char[] ge0018fFechaalta = Field.fillLowValue(10);

						@Getter @Setter private char[] ge0018fFechabaja = Field.fillLowValue(10);

						@Getter @Setter private char[] ge0018fCodnodo = Field.fillLowValue(8);

						@Getter @Setter private char[] ge0018fResambito = Field.fillLowValue(12);

								@Getter @Setter private int ge0018fNumresamb;

								@Getter @Setter private int ge0018fNumpresamb;

						@Getter @Setter private char[] ge0018fCengescapt = Field.fillLowValue(8);

								@Getter @Setter private int ge0018fNumgescap;

								@Getter @Setter private int ge0018fNumpgescap;

								@Getter @Setter private int ge0018fNumpesprie;

						@Getter @Setter private char[] ge0018fCodcarrie = Field.fillLowValue(8);

						@Getter @Setter private char[] ge0018fFecciecurso = Field.fillLowValue(10);
	
	/**
	* Constructor for Ge0018f
	**/
    public Ge0018f() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes Ge0018f
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setGe0018fCodentid(CONSTANTS.SPACE_2);
         setGe0018fTipproduct(CONSTANTS.SPACE_3);
                     setGe0018fCodcontrat(0);
                     setGe0018fOfigestora(0);
         setGe0018fIdepsig(CONSTANTS.SPACE_12);
                     setGe0018fNumpersona(0);
                     setGe0018fNumcartera(0);
         setGe0018fCodcartera(CONSTANTS.SPACE_8);
         setGe0018fFechaalta(CONSTANTS.SPACE_10);
         setGe0018fFechabaja(CONSTANTS.SPACE_10);
         setGe0018fCodnodo(CONSTANTS.SPACE_8);
         setGe0018fResambito(CONSTANTS.SPACE_12);
                     setGe0018fNumresamb(0);
                     setGe0018fNumpresamb(0);
         setGe0018fCengescapt(CONSTANTS.SPACE_8);
                     setGe0018fNumgescap(0);
                     setGe0018fNumpgescap(0);
                     setGe0018fNumpesprie(0);
         setGe0018fCodcarrie(CONSTANTS.SPACE_8);
         setGe0018fFecciecurso(CONSTANTS.SPACE_10);
   }


}
  
