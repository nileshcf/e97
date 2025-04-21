package com.cloudframe.app.cfif01.dto;

/**
*  The class DelayUsageTotBp2Bp3Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:58. using version 5.0.0.256
**/


import com.cloudframe.app.cfif01.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;


public class DelayUsageTotBp2Bp3Group extends DelayUsageTotBp2Bp3GroupSerialized {
   

								private int delayUsageTotBp2Bp3;

								private BigDecimal delayUsageTotBp2Bp3Dec = BigDecimal.ZERO;
	
	/**
	* Constructor for DelayUsageTotBp2Bp3Group
	**/
    public DelayUsageTotBp2Bp3Group() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	public int getDelayUsageTotBp2Bp3() throws CFException {
        if (isDelayUsageTotBp2Bp3Modified()) { 
           delayUsageTotBp2Bp3 = refreshDelayUsageTotBp2Bp3();
        }
   		return delayUsageTotBp2Bp3;
	}
	
	/**
	 * 	Update DelayUsageTotBp2Bp3 with the passed value
	 *  Corresponding COBOL Variable is WS-DELAY-USAGE-TOT-BP2-BP3
	 *	@param number
	 */
	public void setDelayUsageTotBp2Bp3(int number) {
			delayUsageTotBp2Bp3 = checkDelayUsageTotBp2Bp3MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeDelayUsageTotBp2Bp3(delayUsageTotBp2Bp3);
	}


	public void setDelayUsageTotBp2Bp3(long number) {
	    number = checkDelayUsageTotBp2Bp3MaxLimit(number); // Truncate if value is beyond +/- Max range
		setDelayUsageTotBp2Bp3((int)number);
	}
	
	public BigDecimal getDelayUsageTotBp2Bp3Dec() throws CFException {
        if (isDelayUsageTotBp2Bp3DecModified()) { 
           delayUsageTotBp2Bp3Dec = refreshDelayUsageTotBp2Bp3Dec();
        }
   		return delayUsageTotBp2Bp3Dec;
	}

    public char[] getDelayUsageTotBp2Bp3DecString() {
          return  delayUsageTotBp2Bp3DecString();
    }
	
	/**
	 * 	Update DelayUsageTotBp2Bp3Dec with the passed number
	 *  Corresponding COBOL Variable is WS-DELAY-USAGE-TOT-BP2-BP3-DEC
	 *	@param number
	 */
	public void setDelayUsageTotBp2Bp3Dec(BigDecimal number) {	
     delayUsageTotBp2Bp3Dec = checkDelayUsageTotBp2Bp3DecMaxLimit(number);
	    serializeDelayUsageTotBp2Bp3Dec(delayUsageTotBp2Bp3Dec);
   }

	
	
	

		public static int getDelayUsageTotBp2Bp3GroupFieldLength() {
			return DELAY_USAGE_TOT_BP_2_BP_3_GROUP_LENGTH;
		}

}
  
