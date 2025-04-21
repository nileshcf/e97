package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip0040iCardHldrBlngCur is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


public class Ip0040iCardHldrBlngCur extends Ip0040iCardHldrBlngCurSerialized { 
   

								private int ip0040iCardMastDfltCur;

								private int ip0040iCardMastDfltExp;
			private List<Ip0040iPrimaryCrncyTbl> ip0040iPrimaryCrncyTbl = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip0040iCardHldrBlngCur
	**/
    public Ip0040iCardHldrBlngCur() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip0040iCardHldrBlngCur. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040iCardHldrBlngCur(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip0040iCardMastDfltCur
	 *	@return ip0040iCardMastDfltCur
	 */
	public int getIp0040iCardMastDfltCur() throws CFException {
       if (isIp0040iCardMastDfltCurModified()) { 
           ip0040iCardMastDfltCur = refreshIp0040iCardMastDfltCur();
        }
   		return ip0040iCardMastDfltCur;
	}
	

	
	   
	/**
	 * 	Update Ip0040iCardMastDfltCur with the passed value
	 *  Corresponding COBOL Variable is IP0040I-CARD-MAST-DFLT-CUR
	 *	@param number
	 */
	public void setIp0040iCardMastDfltCur(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040iCardMastDfltCur = checkIp0040iCardMastDfltCurMaxLimit(number); 
		serializeIp0040iCardMastDfltCur(ip0040iCardMastDfltCur);
	}
	

	public void setIp0040iCardMastDfltCur(long number) {
	    number = checkIp0040iCardMastDfltCurMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp0040iCardMastDfltCur((int)number);
	}
	
	/**
	 * 	Update Ip0040iCardMastDfltCur with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040iCardMastDfltCur(char[] value) throws CFException {
		 ip0040iCardMastDfltCur = serializeIp0040iCardMastDfltCur(value);
	}
	/**
	 * 	Update Ip0040iCardMastDfltCur with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040iCardMastDfltCurString(char[] value) throws CFException {
		 setIp0040iCardMastDfltCur(value);
	}
	/**
	 *	Returns the value of ip0040iCardMastDfltExp
	 *	@return ip0040iCardMastDfltExp
	 */
	public int getIp0040iCardMastDfltExp() throws CFException {
       if (isIp0040iCardMastDfltExpModified()) { 
           ip0040iCardMastDfltExp = refreshIp0040iCardMastDfltExp();
        }
   		return ip0040iCardMastDfltExp;
	}
	

	
	   
	/**
	 * 	Update Ip0040iCardMastDfltExp with the passed value
	 *  Corresponding COBOL Variable is IP0040I-CARD-MAST-DFLT-EXP
	 *	@param number
	 */
	public void setIp0040iCardMastDfltExp(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040iCardMastDfltExp = checkIp0040iCardMastDfltExpMaxLimit(number); 
		serializeIp0040iCardMastDfltExp(ip0040iCardMastDfltExp);
	}
	

	public void setIp0040iCardMastDfltExp(long number) {
	    number = checkIp0040iCardMastDfltExpMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp0040iCardMastDfltExp((int)number);
	}
	
	/**
	 * 	Update Ip0040iCardMastDfltExp with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040iCardMastDfltExp(char[] value) throws CFException {
		 ip0040iCardMastDfltExp = serializeIp0040iCardMastDfltExp(value);
	}
	/**
	 * 	Update Ip0040iCardMastDfltExp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040iCardMastDfltExpString(char[] value) throws CFException {
		 setIp0040iCardMastDfltExp(value);
	}
	/**
	 *	Returns the  value of ip0040iPrimaryCrncyTbl
	 *  Corresponding COBOL Variable is IP0040I-PRIMARY-CRNCY-TBL
	 *	@return ip0040iPrimaryCrncyTbl
	 */
   public List<Ip0040iPrimaryCrncyTbl> getIp0040iPrimaryCrncyTbl() {
       return ip0040iPrimaryCrncyTbl;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip0040iPrimaryCrncyTbl
	 */
	public Ip0040iPrimaryCrncyTbl getIp0040iPrimaryCrncyTbl(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp0040iPrimaryCrncyTbl(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_0040I_PRIMARY_CRNCY_TBL_SIZE) {
             	index = IP_0040I_PRIMARY_CRNCY_TBL_SIZE -1; // can't exceed max array size
             	logger.trace("ip0040iPrimaryCrncyTbl - Array index exceeded max Size {}, resetting it to max allowed",IP_0040I_PRIMARY_CRNCY_TBL_SIZE); 
	    }
		if (index >= ip0040iPrimaryCrncyTbl.size()) {
       		for (int fillIndex =  ip0040iPrimaryCrncyTbl.size() -1; fillIndex < index;fillIndex++) {
		       ip0040iPrimaryCrncyTbl.add(null);
		    }
			ip0040iPrimaryCrncyTbl.set(index,
			   	   	new Ip0040iPrimaryCrncyTbl(this,beginIp0040iPrimaryCrncyTbl + index * Ip0040iPrimaryCrncyTbl.getIp0040iPrimaryCrncyTblFieldLength()) 
				                        ); 	
		} 
   	   Ip0040iPrimaryCrncyTbl value = ip0040iPrimaryCrncyTbl.get(index);
   	   if (value == null) {
   	      ip0040iPrimaryCrncyTbl.set(index,
			   	   	new Ip0040iPrimaryCrncyTbl(this,beginIp0040iPrimaryCrncyTbl + index * Ip0040iPrimaryCrncyTbl.getIp0040iPrimaryCrncyTblFieldLength()) 
				                        ); 
		  value = ip0040iPrimaryCrncyTbl.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip0040iPrimaryCrncyTbl at index with the passed value
	 *  Corresponding COBOL Variable is IP0040I-PRIMARY-CRNCY-TBL
	 *  @param index
	 *	@param value
	 */
  public void setIp0040iPrimaryCrncyTbl(int index,char[] value) {
   	getIp0040iPrimaryCrncyTbl(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes Ip0040iCardHldrBlngCur
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp0040iCardMastDfltCur(0);
                     setIp0040iCardMastDfltExp(0);
     if (ip0040iPrimaryCrncyTbl.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_0040I_PRIMARY_CRNCY_TBL_SIZE;index++) {
              Ip0040iPrimaryCrncyTbl  newElement = new Ip0040iPrimaryCrncyTbl(this,beginIp0040iPrimaryCrncyTbl + index * Ip0040iPrimaryCrncyTbl.getIp0040iPrimaryCrncyTblFieldLength());
              newElement.initialize();
               ip0040iPrimaryCrncyTbl.add(newElement);
          }
     } else {
        if (ip0040iPrimaryCrncyTbl.size() < IP_0040I_PRIMARY_CRNCY_TBL_SIZE) {
          // prefill it first
          for (int index = ip0040iPrimaryCrncyTbl.size();index <  IP_0040I_PRIMARY_CRNCY_TBL_SIZE;index++) {
              Ip0040iPrimaryCrncyTbl  newElement = new Ip0040iPrimaryCrncyTbl(this,beginIp0040iPrimaryCrncyTbl + index * Ip0040iPrimaryCrncyTbl.getIp0040iPrimaryCrncyTblFieldLength());
               ip0040iPrimaryCrncyTbl.add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_0040I_PRIMARY_CRNCY_TBL_SIZE;index++) {
     		Ip0040iPrimaryCrncyTbl ip0040iPrimaryCrncyTblVar = ip0040iPrimaryCrncyTbl.get(index);
 			if (ip0040iPrimaryCrncyTblVar == null) {
                ip0040iPrimaryCrncyTblVar = new Ip0040iPrimaryCrncyTbl(this,beginIp0040iPrimaryCrncyTbl + index * Ip0040iPrimaryCrncyTbl.getIp0040iPrimaryCrncyTblFieldLength());
                  ip0040iPrimaryCrncyTbl.set(index, ip0040iPrimaryCrncyTblVar);
			} 
			ip0040iPrimaryCrncyTblVar.initialize();
		}
     }
   }

		public static int getIp0040iCardHldrBlngCurFieldLength() {
			return IP_0040I_CARD_HLDR_BLNG_CUR_LENGTH;
		}

}
  
