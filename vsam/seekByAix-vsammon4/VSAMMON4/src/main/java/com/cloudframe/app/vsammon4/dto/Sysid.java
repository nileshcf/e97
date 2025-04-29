package com.cloudframe.app.vsammon4.dto;

/**
*  The class Sysid is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:19. using version 5.0.0.257
**/


import com.cloudframe.app.vsammon4.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Sysid extends SysidSerialized {
   


								private int sysidNnn;
	
	/**
	* Constructor for Sysid
	**/
    public Sysid() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("S").toCharArray()
             , getStartOffset() + 0
             ,1
             );
    }


 

	/**
	 *	Returns the value of sysidNnn
	 *	@return sysidNnn
	 */
	public int getSysidNnn() throws CFException {
       if (isSysidNnnModified()) { 
           sysidNnn = refreshSysidNnn();
        }
   		return sysidNnn;
	}
	

	
	   
	/**
	 * 	Update SysidNnn with the passed value
	 *  Corresponding COBOL Variable is WS-SYSID-NNN
	 *	@param number
	 */
	public void setSysidNnn(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    sysidNnn = checkSysidNnnMaxLimit(number); 
		serializeSysidNnn(sysidNnn);
	}
	

	public void setSysidNnn(long number) {
	    number = checkSysidNnnMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSysidNnn((int)number);
	}
	
	/**
	 * 	Update SysidNnn with the passed value
	 *	@param value (String or char[])
	 */
	public void setSysidNnn(char[] value) throws CFException {
		 sysidNnn = serializeSysidNnn(value);
	}
	/**
	 * 	Update SysidNnn with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSysidNnnString(char[] value) throws CFException {
		 setSysidNnn(value);
	}

	
	
	

		public static int getSysidFieldLength() {
			return SYSID_LENGTH;
		}

}
  
