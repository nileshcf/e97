package com.cloudframe.app.db2funci.dto;

/**
*  The class Dclvbsscrdt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;


@Data
public class Dclvbsscrdt extends DclvbsscrdtSerialized {
   

								@Getter @Setter private BigDecimal yieldBidPct;

								@Getter @Setter private short putNtcMinDyQty;

								@Getter @Setter private short putNtcMaxDyQty;
	
	/**
	* Constructor for Dclvbsscrdt
	**/
    public Dclvbsscrdt() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
