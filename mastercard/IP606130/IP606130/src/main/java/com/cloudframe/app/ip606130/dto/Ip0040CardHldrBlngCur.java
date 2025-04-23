package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip0040CardHldrBlngCur is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:59. using version 5.0.0.254
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


public class Ip0040CardHldrBlngCur extends Ip0040CardHldrBlngCurSerialized { 
   

								private int ip0040CardMastDfltCur;

								private int ip0040CardMastDfltExp;
			private List<Ip0040PrimaryCrncyTbl> ip0040PrimaryCrncyTbl = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip0040CardHldrBlngCur
	**/
    public Ip0040CardHldrBlngCur() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip0040CardHldrBlngCur. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040CardHldrBlngCur(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip0040CardMastDfltCur
	 *	@return ip0040CardMastDfltCur
	 */
	public int getIp0040CardMastDfltCur() throws CFException {
       if (isIp0040CardMastDfltCurModified()) { 
           ip0040CardMastDfltCur = refreshIp0040CardMastDfltCur();
        }
   		return ip0040CardMastDfltCur;
	}
	

	
	   
	/**
	 * 	Update Ip0040CardMastDfltCur with the passed value
	 *  Corresponding COBOL Variable is IP0040-CARD-MAST-DFLT-CUR
	 *	@param number
	 */
	public void setIp0040CardMastDfltCur(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040CardMastDfltCur = checkIp0040CardMastDfltCurMaxLimit(number); 
		serializeIp0040CardMastDfltCur(ip0040CardMastDfltCur);
	}
	

	public void setIp0040CardMastDfltCur(long number) {
	    number = checkIp0040CardMastDfltCurMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp0040CardMastDfltCur((int)number);
	}
	
	/**
	 * 	Update Ip0040CardMastDfltCur with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040CardMastDfltCur(char[] value) throws CFException {
		 ip0040CardMastDfltCur = serializeIp0040CardMastDfltCur(value);
	}
	/**
	 * 	Update Ip0040CardMastDfltCur with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040CardMastDfltCurString(char[] value) throws CFException {
		 setIp0040CardMastDfltCur(value);
	}
	/**
	 *	Returns the value of ip0040CardMastDfltExp
	 *	@return ip0040CardMastDfltExp
	 */
	public int getIp0040CardMastDfltExp() throws CFException {
       if (isIp0040CardMastDfltExpModified()) { 
           ip0040CardMastDfltExp = refreshIp0040CardMastDfltExp();
        }
   		return ip0040CardMastDfltExp;
	}
	

	
	   
	/**
	 * 	Update Ip0040CardMastDfltExp with the passed value
	 *  Corresponding COBOL Variable is IP0040-CARD-MAST-DFLT-EXP
	 *	@param number
	 */
	public void setIp0040CardMastDfltExp(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040CardMastDfltExp = checkIp0040CardMastDfltExpMaxLimit(number); 
		serializeIp0040CardMastDfltExp(ip0040CardMastDfltExp);
	}
	

	public void setIp0040CardMastDfltExp(long number) {
	    number = checkIp0040CardMastDfltExpMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp0040CardMastDfltExp((int)number);
	}
	
	/**
	 * 	Update Ip0040CardMastDfltExp with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040CardMastDfltExp(char[] value) throws CFException {
		 ip0040CardMastDfltExp = serializeIp0040CardMastDfltExp(value);
	}
	/**
	 * 	Update Ip0040CardMastDfltExp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040CardMastDfltExpString(char[] value) throws CFException {
		 setIp0040CardMastDfltExp(value);
	}
	/**
	 *	Returns the  value of ip0040PrimaryCrncyTbl
	 *  Corresponding COBOL Variable is IP0040-PRIMARY-CRNCY-TBL
	 *	@return ip0040PrimaryCrncyTbl
	 */
   public List<Ip0040PrimaryCrncyTbl> getIp0040PrimaryCrncyTbl() {
       return ip0040PrimaryCrncyTbl;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip0040PrimaryCrncyTbl
	 */
	public Ip0040PrimaryCrncyTbl getIp0040PrimaryCrncyTbl(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp0040PrimaryCrncyTbl(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_0040_PRIMARY_CRNCY_TBL_SIZE) {
             	index = IP_0040_PRIMARY_CRNCY_TBL_SIZE -1; // can't exceed max array size
             	logger.trace("ip0040PrimaryCrncyTbl - Array index exceeded max Size {}, resetting it to max allowed",IP_0040_PRIMARY_CRNCY_TBL_SIZE); 
	    }
		if (index >= ip0040PrimaryCrncyTbl.size()) {
       		for (int fillIndex =  ip0040PrimaryCrncyTbl.size() -1; fillIndex < index;fillIndex++) {
		       ip0040PrimaryCrncyTbl.add(null);
		    }
			ip0040PrimaryCrncyTbl.set(index,
			   	   	new Ip0040PrimaryCrncyTbl(this,beginIp0040PrimaryCrncyTbl + index * Ip0040PrimaryCrncyTbl.getIp0040PrimaryCrncyTblFieldLength()) 
				                        ); 	
		} 
   	   Ip0040PrimaryCrncyTbl value = ip0040PrimaryCrncyTbl.get(index);
   	   if (value == null) {
   	      ip0040PrimaryCrncyTbl.set(index,
			   	   	new Ip0040PrimaryCrncyTbl(this,beginIp0040PrimaryCrncyTbl + index * Ip0040PrimaryCrncyTbl.getIp0040PrimaryCrncyTblFieldLength()) 
				                        ); 
		  value = ip0040PrimaryCrncyTbl.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip0040PrimaryCrncyTbl at index with the passed value
	 *  Corresponding COBOL Variable is IP0040-PRIMARY-CRNCY-TBL
	 *  @param index
	 *	@param value
	 */
  public void setIp0040PrimaryCrncyTbl(int index,char[] value) {
   	getIp0040PrimaryCrncyTbl(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes Ip0040CardHldrBlngCur
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp0040CardMastDfltCur(0);
                     setIp0040CardMastDfltExp(0);
     if (ip0040PrimaryCrncyTbl.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_0040_PRIMARY_CRNCY_TBL_SIZE;index++) {
              Ip0040PrimaryCrncyTbl  newElement = new Ip0040PrimaryCrncyTbl(this,beginIp0040PrimaryCrncyTbl + index * Ip0040PrimaryCrncyTbl.getIp0040PrimaryCrncyTblFieldLength());
              newElement.initialize();
               ip0040PrimaryCrncyTbl.add(newElement);
          }
     } else {
        if (ip0040PrimaryCrncyTbl.size() < IP_0040_PRIMARY_CRNCY_TBL_SIZE) {
          // prefill it first
          for (int index = ip0040PrimaryCrncyTbl.size();index <  IP_0040_PRIMARY_CRNCY_TBL_SIZE;index++) {
              Ip0040PrimaryCrncyTbl  newElement = new Ip0040PrimaryCrncyTbl(this,beginIp0040PrimaryCrncyTbl + index * Ip0040PrimaryCrncyTbl.getIp0040PrimaryCrncyTblFieldLength());
               ip0040PrimaryCrncyTbl.add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_0040_PRIMARY_CRNCY_TBL_SIZE;index++) {
     		Ip0040PrimaryCrncyTbl ip0040PrimaryCrncyTblVar = ip0040PrimaryCrncyTbl.get(index);
 			if (ip0040PrimaryCrncyTblVar == null) {
                ip0040PrimaryCrncyTblVar = new Ip0040PrimaryCrncyTbl(this,beginIp0040PrimaryCrncyTbl + index * Ip0040PrimaryCrncyTbl.getIp0040PrimaryCrncyTblFieldLength());
                  ip0040PrimaryCrncyTbl.set(index, ip0040PrimaryCrncyTblVar);
			} 
			ip0040PrimaryCrncyTblVar.initialize();
		}
     }
   }

		public static int getIp0040CardHldrBlngCurFieldLength() {
			return IP_0040_CARD_HLDR_BLNG_CUR_LENGTH;
		}

}
  
