package com.cloudframe.app.comput1.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;


@Data
public class Work extends WorkSerialized {
   

								@Getter @Setter private long div;

								@Getter @Setter private BigDecimal allow = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal oosuSharedAllow = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal rlu3aTotDataPromoAllow = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal rlu3aAcctPlanDataAllow = BigDecimal.ZERO;

								@Getter @Setter private int cGigabyteNum;

								@Getter @Setter private int cKilobyteNum;

								@Getter @Setter private int cMegabyteNum;

								@Getter @Setter private short i;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setCGigabyteNum(1073741824);
								setCKilobyteNum(1024);
								setCMegabyteNum(1048576);
    }





}
  
