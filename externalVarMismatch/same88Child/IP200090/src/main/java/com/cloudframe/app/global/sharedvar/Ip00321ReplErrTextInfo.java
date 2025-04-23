package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00321ReplErrTextInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


public class Ip00321ReplErrTextInfo extends Ip00321ReplErrTextInfoSerialized { 
   

								private int ip00321ReplTextCount;
			private List<Ip00321ReplTextIndicators> ip00321ReplTextIndicators = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip00321ReplErrTextInfo
	**/
    public Ip00321ReplErrTextInfo() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00321ReplErrTextInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00321ReplErrTextInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip00321ReplTextCount
	 *	@return ip00321ReplTextCount
	 */
	public int getIp00321ReplTextCount() throws CFException {
       if (isIp00321ReplTextCountModified()) { 
           ip00321ReplTextCount = refreshIp00321ReplTextCount();
        }
   		return ip00321ReplTextCount;
	}
	

	
	   
	/**
	 * 	Update Ip00321ReplTextCount with the passed value
	 *  Corresponding COBOL Variable is IP00321-REPL-TEXT-COUNT
	 *	@param number
	 */
	public void setIp00321ReplTextCount(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00321ReplTextCount = checkIp00321ReplTextCountMaxLimit(number); 
		serializeIp00321ReplTextCount(ip00321ReplTextCount);
	}
	

	public void setIp00321ReplTextCount(long number) {
	    number = checkIp00321ReplTextCountMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp00321ReplTextCount((int)number);
	}
	
	/**
	 * 	Update Ip00321ReplTextCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00321ReplTextCount(char[] value) throws CFException {
		 ip00321ReplTextCount = serializeIp00321ReplTextCount(value);
	}
	/**
	 * 	Update Ip00321ReplTextCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00321ReplTextCountString(char[] value) throws CFException {
		 setIp00321ReplTextCount(value);
	}
	
	/**
	 *	Test condition 0 THRU 3 for isIp00321RepltxtCntInRnge88()
	 *	@return  Returns true if isIp00321RepltxtCntInRnge88() is 0 THRU 3
	 */
   public boolean isIp00321RepltxtCntInRnge88() throws CFException {
      return (   (getIp00321ReplTextCount()  >=  0 ) &&   (getIp00321ReplTextCount()  <=  3 )   );
   }


	/**
	*  set values 0 THRU 3
	*/
   	public void setIp00321RepltxtCntInRnge88True() {  			
    	setIp00321ReplTextCount( 0);
   	}
	/**
	 *	Returns the  value of ip00321ReplTextIndicators
	 *  Corresponding COBOL Variable is IP00321-REPL-TEXT-INDICATORS
	 *	@return ip00321ReplTextIndicators
	 */
   public List<Ip00321ReplTextIndicators> getIp00321ReplTextIndicators() {
       return ip00321ReplTextIndicators;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip00321ReplTextIndicators
	 */
	public Ip00321ReplTextIndicators getIp00321ReplTextIndicators(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp00321ReplTextIndicators(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_00321_REPL_TEXT_INDICATORS_SIZE) {
             	index = IP_00321_REPL_TEXT_INDICATORS_SIZE -1; // can't exceed max array size
             	logger.trace("ip00321ReplTextIndicators - Array index exceeded max Size {}, resetting it to max allowed",IP_00321_REPL_TEXT_INDICATORS_SIZE); 
	    }
		if (index >= ip00321ReplTextIndicators.size()) {
       		for (int fillIndex =  ip00321ReplTextIndicators.size() -1; fillIndex < index;fillIndex++) {
		       ip00321ReplTextIndicators.add(null);
		    }
			ip00321ReplTextIndicators.set(index,
			   	   	new Ip00321ReplTextIndicators(this,beginIp00321ReplTextIndicators + index * Ip00321ReplTextIndicators.getIp00321ReplTextIndicatorsFieldLength()) 
				                        ); 	
		} 
   	   Ip00321ReplTextIndicators value = ip00321ReplTextIndicators.get(index);
   	   if (value == null) {
   	      ip00321ReplTextIndicators.set(index,
			   	   	new Ip00321ReplTextIndicators(this,beginIp00321ReplTextIndicators + index * Ip00321ReplTextIndicators.getIp00321ReplTextIndicatorsFieldLength()) 
				                        ); 
		  value = ip00321ReplTextIndicators.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip00321ReplTextIndicators at index with the passed value
	 *  Corresponding COBOL Variable is IP00321-REPL-TEXT-INDICATORS
	 *  @param index
	 *	@param value
	 */
  public void setIp00321ReplTextIndicators(int index,char[] value) {
   	getIp00321ReplTextIndicators(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes Ip00321ReplErrTextInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp00321ReplTextCount(0);
     if (ip00321ReplTextIndicators.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_00321_REPL_TEXT_INDICATORS_SIZE;index++) {
              Ip00321ReplTextIndicators  newElement = new Ip00321ReplTextIndicators(this,beginIp00321ReplTextIndicators + index * Ip00321ReplTextIndicators.getIp00321ReplTextIndicatorsFieldLength());
              newElement.initialize();
               ip00321ReplTextIndicators.add(newElement);
          }
     } else {
        if (ip00321ReplTextIndicators.size() < IP_00321_REPL_TEXT_INDICATORS_SIZE) {
          // prefill it first
          for (int index = ip00321ReplTextIndicators.size();index <  IP_00321_REPL_TEXT_INDICATORS_SIZE;index++) {
              Ip00321ReplTextIndicators  newElement = new Ip00321ReplTextIndicators(this,beginIp00321ReplTextIndicators + index * Ip00321ReplTextIndicators.getIp00321ReplTextIndicatorsFieldLength());
               ip00321ReplTextIndicators.add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_00321_REPL_TEXT_INDICATORS_SIZE;index++) {
     		Ip00321ReplTextIndicators ip00321ReplTextIndicatorsVar = ip00321ReplTextIndicators.get(index);
 			if (ip00321ReplTextIndicatorsVar == null) {
                ip00321ReplTextIndicatorsVar = new Ip00321ReplTextIndicators(this,beginIp00321ReplTextIndicators + index * Ip00321ReplTextIndicators.getIp00321ReplTextIndicatorsFieldLength());
                  ip00321ReplTextIndicators.set(index, ip00321ReplTextIndicatorsVar);
			} 
			ip00321ReplTextIndicatorsVar.initialize();
		}
     }
   }

		public static int getIp00321ReplErrTextInfoFieldLength() {
			return IP_00321_REPL_ERR_TEXT_INFO_LENGTH;
		}

}
  
