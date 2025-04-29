package com.cloudframe.app.ar640010.dto;

/**
*  The class Ar648LinkArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Ar648LinkArea extends Ar648LinkAreaSerialized {
   

								private short ar648RequestCode;

								private short ar648ReturnCode;
	
	/**
	* Constructor for Ar648LinkArea
	**/
    public Ar648LinkArea() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setAr648RequestCode((short)0);
								setAr648ReturnCode((short)0);
    }


 

	/**
	 *	Returns the value of ar648RequestCode
	 *	@return ar648RequestCode
	 */
	public short getAr648RequestCode() throws CFException {
        if (isAr648RequestCodeModified()) { 
           ar648RequestCode = refreshAr648RequestCode();
        }
   		return ar648RequestCode;
	}
	
	/**
	 * 	Update Ar648RequestCode with the passed value
	 *  Corresponding COBOL Variable is AR648-REQUEST-CODE
	 *	@param number
	 */
	public void setAr648RequestCode(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ar648RequestCode = checkAr648RequestCodeMaxLimit(number); 
		serializeAr648RequestCode(ar648RequestCode);
	}

	public void setAr648RequestCode(int number) {
	    number = checkAr648RequestCodeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAr648RequestCode((short)number);
	}
	public void setAr648RequestCode(long number) {
	    number = checkAr648RequestCodeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAr648RequestCode((short)number);
	}
	

	
	/**
	 *	Test condition 0 for isAr648RequestJclExec88()
	 *	@return  Returns true if isAr648RequestJclExec88() is 0
	 */
   public boolean isAr648RequestJclExec88() throws CFException {
      return (  getAr648RequestCode()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setAr648RequestJclExec88True() {  			
    	setAr648RequestCode( (short)0);
   	}
	
	/**
	 *	Test condition 1 THRU 4 for isAr648RequestSubPgm88()
	 *	@return  Returns true if isAr648RequestSubPgm88() is 1 THRU 4
	 */
   public boolean isAr648RequestSubPgm88() throws CFException {
      return (   (getAr648RequestCode()  >=  1 ) &&   (getAr648RequestCode()  <=  4 )   );
   }


	/**
	*  set values 1 THRU 4
	*/
   	public void setAr648RequestSubPgm88True() {  			
    	setAr648RequestCode( (short)1);
   	}
	
	/**
	 *	Test condition 1 for isAr648RequestMgrOpen88()
	 *	@return  Returns true if isAr648RequestMgrOpen88() is 1
	 */
   public boolean isAr648RequestMgrOpen88() throws CFException {
      return (  getAr648RequestCode()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setAr648RequestMgrOpen88True() {  			
    	setAr648RequestCode( (short)1);
   	}
	
	/**
	 *	Test condition 2 for isAr648RequestMgrWrite88()
	 *	@return  Returns true if isAr648RequestMgrWrite88() is 2
	 */
   public boolean isAr648RequestMgrWrite88() throws CFException {
      return (  getAr648RequestCode()  ==  2  );
   }


	/**
	*  set values 2
	*/
   	public void setAr648RequestMgrWrite88True() {  			
    	setAr648RequestCode( (short)2);
   	}
	
	/**
	 *	Test condition 3 for isAr648RequestMgrClose88()
	 *	@return  Returns true if isAr648RequestMgrClose88() is 3
	 */
   public boolean isAr648RequestMgrClose88() throws CFException {
      return (  getAr648RequestCode()  ==  3  );
   }


	/**
	*  set values 3
	*/
   	public void setAr648RequestMgrClose88True() {  			
    	setAr648RequestCode( (short)3);
   	}
	
	/**
	 *	Test condition 4 for isAr648RequestUtilTotal88()
	 *	@return  Returns true if isAr648RequestUtilTotal88() is 4
	 */
   public boolean isAr648RequestUtilTotal88() throws CFException {
      return (  getAr648RequestCode()  ==  4  );
   }


	/**
	*  set values 4
	*/
   	public void setAr648RequestUtilTotal88True() {  			
    	setAr648RequestCode( (short)4);
   	}
	/**
	 *	Returns the value of ar648ReturnCode
	 *	@return ar648ReturnCode
	 */
	public short getAr648ReturnCode() throws CFException {
        if (isAr648ReturnCodeModified()) { 
           ar648ReturnCode = refreshAr648ReturnCode();
        }
   		return ar648ReturnCode;
	}
	
	/**
	 * 	Update Ar648ReturnCode with the passed value
	 *  Corresponding COBOL Variable is AR648-RETURN-CODE
	 *	@param number
	 */
	public void setAr648ReturnCode(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ar648ReturnCode = checkAr648ReturnCodeMaxLimit(number); 
		serializeAr648ReturnCode(ar648ReturnCode);
	}

	public void setAr648ReturnCode(int number) {
	    number = checkAr648ReturnCodeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAr648ReturnCode((short)number);
	}
	public void setAr648ReturnCode(long number) {
	    number = checkAr648ReturnCodeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAr648ReturnCode((short)number);
	}
	

	
	/**
	 *	Test condition 0 for isAr648ReturnRequestValid88()
	 *	@return  Returns true if isAr648ReturnRequestValid88() is 0
	 */
   public boolean isAr648ReturnRequestValid88() throws CFException {
      return (  getAr648ReturnCode()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setAr648ReturnRequestValid88True() {  			
    	setAr648ReturnCode( (short)0);
   	}
	
	/**
	 *	Test condition 4 for isAr648ReturnRequestError88()
	 *	@return  Returns true if isAr648ReturnRequestError88() is 4
	 */
   public boolean isAr648ReturnRequestError88() throws CFException {
      return (  getAr648ReturnCode()  ==  4  );
   }


	/**
	*  set values 4
	*/
   	public void setAr648ReturnRequestError88True() {  			
    	setAr648ReturnCode( (short)4);
   	}
	
	/**
	 *	Test condition 8 for isAr648ReturnRequestOrder88()
	 *	@return  Returns true if isAr648ReturnRequestOrder88() is 8
	 */
   public boolean isAr648ReturnRequestOrder88() throws CFException {
      return (  getAr648ReturnCode()  ==  8  );
   }


	/**
	*  set values 8
	*/
   	public void setAr648ReturnRequestOrder88True() {  			
    	setAr648ReturnCode( (short)8);
   	}
	
	/**
	 *	Test condition 12 for isAr648ReturnRequestEntry88()
	 *	@return  Returns true if isAr648ReturnRequestEntry88() is 12
	 */
   public boolean isAr648ReturnRequestEntry88() throws CFException {
      return (  getAr648ReturnCode()  ==  12  );
   }


	/**
	*  set values 12
	*/
   	public void setAr648ReturnRequestEntry88True() {  			
    	setAr648ReturnCode( (short)12);
   	}
	
	/**
	 *	Test condition 16 for isAr648ReturnSyslstIoErr88()
	 *	@return  Returns true if isAr648ReturnSyslstIoErr88() is 16
	 */
   public boolean isAr648ReturnSyslstIoErr88() throws CFException {
      return (  getAr648ReturnCode()  ==  16  );
   }


	/**
	*  set values 16
	*/
   	public void setAr648ReturnSyslstIoErr88True() {  			
    	setAr648ReturnCode( (short)16);
   	}

	
	
	

		public static int getAr648LinkAreaFieldLength() {
			return AR_648_LINK_AREA_LENGTH;
		}

}
  
