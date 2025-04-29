package com.cloudframe.app.sf305120.dto;

/**
*  The class ZlogPointers410 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ZlogPointers410 extends ZlogPointers410Serialized {
   

								@Getter @Setter private short servInfoCount410;

								@Getter @Setter private short servInfoPtr410;

								@Getter @Setter private short payload1Ptr410;

								@Getter @Setter private short isoMsg2Ptr410;

								@Getter @Setter private short isoMsg2Lnth410;

								@Getter @Setter private short trailer1Ptr410;

								@Getter @Setter private short trailer1Lnth410;

								@Getter @Setter private short trailer2Ptr410;

								@Getter @Setter private short trailer2Lnth410;

								@Getter @Setter private short holdSr2Ptr410;
	
	/**
	* Constructor for ZlogPointers410
	**/
    public ZlogPointers410() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setServInfoCount410((short)0);
								setServInfoPtr410((short)0);
								setPayload1Ptr410((short)0);
								setIsoMsg2Ptr410((short)0);
								setIsoMsg2Lnth410((short)0);
								setTrailer1Ptr410((short)0);
								setTrailer1Lnth410((short)0);
								setTrailer2Ptr410((short)0);
								setTrailer2Lnth410((short)0);
								setHoldSr2Ptr410((short)0);
    }



	/**
	 * 	initializes ZlogPointers410
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setServInfoCount410((short)0);
         	setServInfoPtr410((short)0);
         	setPayload1Ptr410((short)0);
         	setIsoMsg2Ptr410((short)0);
         	setIsoMsg2Lnth410((short)0);
         	setTrailer1Ptr410((short)0);
         	setTrailer1Lnth410((short)0);
         	setTrailer2Ptr410((short)0);
         	setTrailer2Lnth410((short)0);
         	setHoldSr2Ptr410((short)0);
   }


}
  
