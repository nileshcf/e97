package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip67002Mmdd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:21. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip67002Mmdd extends Ip67002MmddSerialized { 
   

								private int ip67002Mm;

								private int ip67002Dd;
	
	/**
	* Constructor for Ip67002Mmdd
	**/
    public Ip67002Mmdd() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip67002Mmdd. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip67002Mmdd(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip67002Mm
	 *	@return ip67002Mm
	 */
	public int getIp67002Mm() throws CFException {
       if (isIp67002MmModified()) { 
           ip67002Mm = refreshIp67002Mm();
        }
   		return ip67002Mm;
	}
	

	
	   
	/**
	 * 	Update Ip67002Mm with the passed value
	 *  Corresponding COBOL Variable is IP67002-MM
	 *	@param number
	 */
	public void setIp67002Mm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip67002Mm = checkIp67002MmMaxLimit(number); 
		serializeIp67002Mm(ip67002Mm);
	}
	

	public void setIp67002Mm(long number) {
	    number = checkIp67002MmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp67002Mm((int)number);
	}
	
	/**
	 * 	Update Ip67002Mm with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Mm(char[] value) throws CFException {
		 ip67002Mm = serializeIp67002Mm(value);
	}
	/**
	 * 	Update Ip67002Mm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002MmString(char[] value) throws CFException {
		 setIp67002Mm(value);
	}
	
	/**
	 *	Test condition 0 for isIp67002ZeroMonth88()
	 *	@return  Returns true if isIp67002ZeroMonth88() is 0
	 */
   public boolean isIp67002ZeroMonth88() throws CFException {
      return (  getIp67002Mm()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setIp67002ZeroMonth88True() {  			
    	setIp67002Mm( 0);
   	}
	
	/**
	 *	Test condition 1 THRU 12 for isIp67002ValidMonth88()
	 *	@return  Returns true if isIp67002ValidMonth88() is 1 THRU 12
	 */
   public boolean isIp67002ValidMonth88() throws CFException {
      return (   (getIp67002Mm()  >=  1 ) &&   (getIp67002Mm()  <=  12 )   );
   }


	/**
	*  set values 1 THRU 12
	*/
   	public void setIp67002ValidMonth88True() {  			
    	setIp67002Mm( 1);
   	}
	/**
	 *	Returns the value of ip67002Dd
	 *	@return ip67002Dd
	 */
	public int getIp67002Dd() throws CFException {
       if (isIp67002DdModified()) { 
           ip67002Dd = refreshIp67002Dd();
        }
   		return ip67002Dd;
	}
	

	
	   
	/**
	 * 	Update Ip67002Dd with the passed value
	 *  Corresponding COBOL Variable is IP67002-DD
	 *	@param number
	 */
	public void setIp67002Dd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip67002Dd = checkIp67002DdMaxLimit(number); 
		serializeIp67002Dd(ip67002Dd);
	}
	

	public void setIp67002Dd(long number) {
	    number = checkIp67002DdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp67002Dd((int)number);
	}
	
	/**
	 * 	Update Ip67002Dd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Dd(char[] value) throws CFException {
		 ip67002Dd = serializeIp67002Dd(value);
	}
	/**
	 * 	Update Ip67002Dd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002DdString(char[] value) throws CFException {
		 setIp67002Dd(value);
	}
	
	/**
	 *	Test condition 0 for isIp67002ZeroDay88()
	 *	@return  Returns true if isIp67002ZeroDay88() is 0
	 */
   public boolean isIp67002ZeroDay88() throws CFException {
      return (  getIp67002Dd()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setIp67002ZeroDay88True() {  			
    	setIp67002Dd( 0);
   	}

	
	
	
	/**
	 * 	initializes Ip67002Mmdd
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp67002Mm(0);
                     setIp67002Dd(0);
   }

		public static int getIp67002MmddFieldLength() {
			return IP_67002_MMDD_LENGTH;
		}

}
  
