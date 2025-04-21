package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip30771TipacliTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip30771TipacliTable")

public class Ip30771TipacliTable extends Ip30771TipacliTableSerialized  implements InitializingBean {
   

								private short ip30771ClrCyclId;

								private short ip30771SetlCyclId;
	
	/**
	* Constructor for Ip30771TipacliTable
	**/
    public Ip30771TipacliTable() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }

 

	public short getIp30771ClrCyclId() throws CFException {
        if (isIp30771ClrCyclIdModified()) { 
           ip30771ClrCyclId = refreshIp30771ClrCyclId();
        }
   		return ip30771ClrCyclId;
	}
	
	/**
	 * 	Update Ip30771ClrCyclId with the passed value
	 *  Corresponding COBOL Variable is IP30771-CLR-CYCL-ID
	 *	@param number
	 */
	public void setIp30771ClrCyclId(short number) {
			ip30771ClrCyclId = checkIp30771ClrCyclIdMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeIp30771ClrCyclId(ip30771ClrCyclId);
	}

	public void setIp30771ClrCyclId(int number) {
	    number = checkIp30771ClrCyclIdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp30771ClrCyclId((short)number);
	}
	public void setIp30771ClrCyclId(long number) {
	    number = checkIp30771ClrCyclIdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp30771ClrCyclId((short)number);
	}
	

	public short getIp30771SetlCyclId() throws CFException {
        if (isIp30771SetlCyclIdModified()) { 
           ip30771SetlCyclId = refreshIp30771SetlCyclId();
        }
   		return ip30771SetlCyclId;
	}
	
	/**
	 * 	Update Ip30771SetlCyclId with the passed value
	 *  Corresponding COBOL Variable is IP30771-SETL-CYCL-ID
	 *	@param number
	 */
	public void setIp30771SetlCyclId(short number) {
			ip30771SetlCyclId = checkIp30771SetlCyclIdMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeIp30771SetlCyclId(ip30771SetlCyclId);
	}

	public void setIp30771SetlCyclId(int number) {
	    number = checkIp30771SetlCyclIdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp30771SetlCyclId((short)number);
	}
	public void setIp30771SetlCyclId(long number) {
	    number = checkIp30771SetlCyclIdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp30771SetlCyclId((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip30771TipacliTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp30771ClrCyclId((short)0);
         	setIp30771SetlCyclId((short)0);
   }

		public static int getIp30771TipacliTableFieldLength() {
			return IP_30771_TIPACLI_TABLE_LENGTH;
		}

}
  
