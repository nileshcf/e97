package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip66607SortInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:00. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;


@GlobalDto
public class Ip66607SortInfo extends Ip66607SortInfoSerialized { 
   

								private int ip66607Start;

								private int ip66607End;
	
	/**
	* Constructor for Ip66607SortInfo
	**/
    public Ip66607SortInfo() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip66607Start
	 *	@return ip66607Start
	 */
	public int getIp66607Start() throws CFException {
        if (isIp66607StartModified()) { 
           ip66607Start = refreshIp66607Start();
        }
   		return ip66607Start;
	}
	
	/**
	 * 	Update Ip66607Start with the passed value
	 *  Corresponding COBOL Variable is IP66607-START
	 *	@param number
	 */
	public void setIp66607Start(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip66607Start = checkIp66607StartMaxLimit(number); 
		serializeIp66607Start(ip66607Start);
	}


	public void setIp66607Start(long number) {
	    number = checkIp66607StartMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp66607Start((int)number);
	}
	
	/**
	 *	Returns the value of ip66607End
	 *	@return ip66607End
	 */
	public int getIp66607End() throws CFException {
        if (isIp66607EndModified()) { 
           ip66607End = refreshIp66607End();
        }
   		return ip66607End;
	}
	
	/**
	 * 	Update Ip66607End with the passed value
	 *  Corresponding COBOL Variable is IP66607-END
	 *	@param number
	 */
	public void setIp66607End(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip66607End = checkIp66607EndMaxLimit(number); 
		serializeIp66607End(ip66607End);
	}


	public void setIp66607End(long number) {
	    number = checkIp66607EndMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp66607End((int)number);
	}
	

	
	
	
	/**
	 * 	initializes Ip66607SortInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp66607Start(0);
                     setIp66607End(0);
   }

		public static int getIp66607SortInfoFieldLength() {
			return IP_66607_SORT_INFO_LENGTH;
		}

}
  
