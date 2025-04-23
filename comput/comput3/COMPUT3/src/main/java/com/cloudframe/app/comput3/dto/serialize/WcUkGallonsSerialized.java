package com.cloudframe.app.comput3.dto.serialize;

/**
*  The class WcUkGallonsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:17. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WcUkGallonsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WcUkGallonsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WC_UK_GALLONS_LENGTH = 108;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWcUkgBbl;
            protected  int beginWcUkgKb;
            protected  int beginWcUkgLit;
            protected  int beginWcUkgM3;
            protected  int beginWcUkgUsg;
            protected  int beginWcUkgUkg;
            protected  int beginWcUkgMmb;
            protected  int beginWcUkgGbt;
            protected  int beginWcUkgThm;
            protected  int beginWcUkgMwh;
            protected  int beginWcUkgGj;
            protected  int beginWcUkgDay;
	
	/**
	* Constructor for WcUkGallonsSerialized
	**/
    public WcUkGallonsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WcUkGallonsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcUkGallonsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WcUkGallonsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,540); // serialize this field at offset 540 by default 
    }
    
	/**
	* sets parent for this WcUkGallonsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 540 by default
    }    
	/**
	* initializes the field in WcUkGallonsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WC_UK_GALLONS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWcUkgBbl = getStartOffset() + 0;	// set offset for serialization
  
             beginWcUkgKb = getStartOffset() + 9;	// set offset for serialization
  
             beginWcUkgLit = getStartOffset() + 18;	// set offset for serialization
  
             beginWcUkgM3 = getStartOffset() + 27;	// set offset for serialization
  
             beginWcUkgUsg = getStartOffset() + 36;	// set offset for serialization
  
             beginWcUkgUkg = getStartOffset() + 45;	// set offset for serialization
  
             beginWcUkgMmb = getStartOffset() + 54;	// set offset for serialization
  
             beginWcUkgGbt = getStartOffset() + 63;	// set offset for serialization
  
             beginWcUkgThm = getStartOffset() + 72;	// set offset for serialization
  
             beginWcUkgMwh = getStartOffset() + 81;	// set offset for serialization
  
             beginWcUkgGj = getStartOffset() + 90;	// set offset for serialization
  
             beginWcUkgDay = getStartOffset() + 99;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localWcUkgBblCounter = -1;
        public boolean isWcUkgBblModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcUkgBblCounter != sharedCounter;
           localWcUkgBblCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcUkgBblIsNumeric() {
	      return decimalIsNumeric(beginWcUkgBbl,WC_UKG_BBL_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcUkgBblString() {
            return getPackedString(beginWcUkgBbl,WC_UKG_BBL_LEN);
         }
   protected static final int WC_UKG_BBL_LEN = 9;
   protected static final int WC_UKG_BBL_SCALE = 4;
  	/**
	 * 	serializeWcUkgBbl
	 */
	protected void serializeWcUkgBbl(BigDecimal wcUkgBbl) {
		   putDecimal(beginWcUkgBbl,wcUkgBbl,WC_UKG_BBL_LEN,WC_UKG_BBL_SCALE,true);
		 localWcUkgBblCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcUkgBblMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcUkgBbl is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcUkgBbl() throws CFException {	
   	try { 
		 return (getDecimal(beginWcUkgBbl,WC_UKG_BBL_LEN,WC_UKG_BBL_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcUkgBbl", beginWcUkgBbl,WC_UKG_BBL_LEN);
     }
   	}
        int localWcUkgKbCounter = -1;
        public boolean isWcUkgKbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcUkgKbCounter != sharedCounter;
           localWcUkgKbCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcUkgKbIsNumeric() {
	      return decimalIsNumeric(beginWcUkgKb,WC_UKG_KB_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcUkgKbString() {
            return getPackedString(beginWcUkgKb,WC_UKG_KB_LEN);
         }
   protected static final int WC_UKG_KB_LEN = 9;
   protected static final int WC_UKG_KB_SCALE = 4;
  	/**
	 * 	serializeWcUkgKb
	 */
	protected void serializeWcUkgKb(BigDecimal wcUkgKb) {
		   putDecimal(beginWcUkgKb,wcUkgKb,WC_UKG_KB_LEN,WC_UKG_KB_SCALE,true);
		 localWcUkgKbCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcUkgKbMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcUkgKb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcUkgKb() throws CFException {	
   	try { 
		 return (getDecimal(beginWcUkgKb,WC_UKG_KB_LEN,WC_UKG_KB_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcUkgKb", beginWcUkgKb,WC_UKG_KB_LEN);
     }
   	}
        int localWcUkgLitCounter = -1;
        public boolean isWcUkgLitModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcUkgLitCounter != sharedCounter;
           localWcUkgLitCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcUkgLitIsNumeric() {
	      return decimalIsNumeric(beginWcUkgLit,WC_UKG_LIT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcUkgLitString() {
            return getPackedString(beginWcUkgLit,WC_UKG_LIT_LEN);
         }
   protected static final int WC_UKG_LIT_LEN = 9;
   protected static final int WC_UKG_LIT_SCALE = 4;
  	/**
	 * 	serializeWcUkgLit
	 */
	protected void serializeWcUkgLit(BigDecimal wcUkgLit) {
		   putDecimal(beginWcUkgLit,wcUkgLit,WC_UKG_LIT_LEN,WC_UKG_LIT_SCALE,true);
		 localWcUkgLitCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcUkgLitMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcUkgLit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcUkgLit() throws CFException {	
   	try { 
		 return (getDecimal(beginWcUkgLit,WC_UKG_LIT_LEN,WC_UKG_LIT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcUkgLit", beginWcUkgLit,WC_UKG_LIT_LEN);
     }
   	}
        int localWcUkgM3Counter = -1;
        public boolean isWcUkgM3Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcUkgM3Counter != sharedCounter;
           localWcUkgM3Counter = sharedCounter; return hasModified; 
        }
	    public boolean wcUkgM3IsNumeric() {
	      return decimalIsNumeric(beginWcUkgM3,WC_UKG_M_3_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcUkgM3String() {
            return getPackedString(beginWcUkgM3,WC_UKG_M_3_LEN);
         }
   protected static final int WC_UKG_M_3_LEN = 9;
   protected static final int WC_UKG_M_3_SCALE = 4;
  	/**
	 * 	serializeWcUkgM3
	 */
	protected void serializeWcUkgM3(BigDecimal wcUkgM3) {
		   putDecimal(beginWcUkgM3,wcUkgM3,WC_UKG_M_3_LEN,WC_UKG_M_3_SCALE,true);
		 localWcUkgM3Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcUkgM3MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcUkgM3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcUkgM3() throws CFException {	
   	try { 
		 return (getDecimal(beginWcUkgM3,WC_UKG_M_3_LEN,WC_UKG_M_3_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcUkgM3", beginWcUkgM3,WC_UKG_M_3_LEN);
     }
   	}
        int localWcUkgUsgCounter = -1;
        public boolean isWcUkgUsgModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcUkgUsgCounter != sharedCounter;
           localWcUkgUsgCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcUkgUsgIsNumeric() {
	      return decimalIsNumeric(beginWcUkgUsg,WC_UKG_USG_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcUkgUsgString() {
            return getPackedString(beginWcUkgUsg,WC_UKG_USG_LEN);
         }
   protected static final int WC_UKG_USG_LEN = 9;
   protected static final int WC_UKG_USG_SCALE = 4;
  	/**
	 * 	serializeWcUkgUsg
	 */
	protected void serializeWcUkgUsg(BigDecimal wcUkgUsg) {
		   putDecimal(beginWcUkgUsg,wcUkgUsg,WC_UKG_USG_LEN,WC_UKG_USG_SCALE,true);
		 localWcUkgUsgCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcUkgUsgMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcUkgUsg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcUkgUsg() throws CFException {	
   	try { 
		 return (getDecimal(beginWcUkgUsg,WC_UKG_USG_LEN,WC_UKG_USG_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcUkgUsg", beginWcUkgUsg,WC_UKG_USG_LEN);
     }
   	}
        int localWcUkgUkgCounter = -1;
        public boolean isWcUkgUkgModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcUkgUkgCounter != sharedCounter;
           localWcUkgUkgCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcUkgUkgIsNumeric() {
	      return decimalIsNumeric(beginWcUkgUkg,WC_UKG_UKG_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcUkgUkgString() {
            return getPackedString(beginWcUkgUkg,WC_UKG_UKG_LEN);
         }
   protected static final int WC_UKG_UKG_LEN = 9;
   protected static final int WC_UKG_UKG_SCALE = 4;
  	/**
	 * 	serializeWcUkgUkg
	 */
	protected void serializeWcUkgUkg(BigDecimal wcUkgUkg) {
		   putDecimal(beginWcUkgUkg,wcUkgUkg,WC_UKG_UKG_LEN,WC_UKG_UKG_SCALE,true);
		 localWcUkgUkgCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcUkgUkgMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcUkgUkg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcUkgUkg() throws CFException {	
   	try { 
		 return (getDecimal(beginWcUkgUkg,WC_UKG_UKG_LEN,WC_UKG_UKG_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcUkgUkg", beginWcUkgUkg,WC_UKG_UKG_LEN);
     }
   	}
        int localWcUkgMmbCounter = -1;
        public boolean isWcUkgMmbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcUkgMmbCounter != sharedCounter;
           localWcUkgMmbCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcUkgMmbIsNumeric() {
	      return decimalIsNumeric(beginWcUkgMmb,WC_UKG_MMB_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcUkgMmbString() {
            return getPackedString(beginWcUkgMmb,WC_UKG_MMB_LEN);
         }
   protected static final int WC_UKG_MMB_LEN = 9;
   protected static final int WC_UKG_MMB_SCALE = 4;
  	/**
	 * 	serializeWcUkgMmb
	 */
	protected void serializeWcUkgMmb(BigDecimal wcUkgMmb) {
		   putDecimal(beginWcUkgMmb,wcUkgMmb,WC_UKG_MMB_LEN,WC_UKG_MMB_SCALE,true);
		 localWcUkgMmbCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcUkgMmbMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcUkgMmb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcUkgMmb() throws CFException {	
   	try { 
		 return (getDecimal(beginWcUkgMmb,WC_UKG_MMB_LEN,WC_UKG_MMB_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcUkgMmb", beginWcUkgMmb,WC_UKG_MMB_LEN);
     }
   	}
        int localWcUkgGbtCounter = -1;
        public boolean isWcUkgGbtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcUkgGbtCounter != sharedCounter;
           localWcUkgGbtCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcUkgGbtIsNumeric() {
	      return decimalIsNumeric(beginWcUkgGbt,WC_UKG_GBT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcUkgGbtString() {
            return getPackedString(beginWcUkgGbt,WC_UKG_GBT_LEN);
         }
   protected static final int WC_UKG_GBT_LEN = 9;
   protected static final int WC_UKG_GBT_SCALE = 4;
  	/**
	 * 	serializeWcUkgGbt
	 */
	protected void serializeWcUkgGbt(BigDecimal wcUkgGbt) {
		   putDecimal(beginWcUkgGbt,wcUkgGbt,WC_UKG_GBT_LEN,WC_UKG_GBT_SCALE,true);
		 localWcUkgGbtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcUkgGbtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcUkgGbt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcUkgGbt() throws CFException {	
   	try { 
		 return (getDecimal(beginWcUkgGbt,WC_UKG_GBT_LEN,WC_UKG_GBT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcUkgGbt", beginWcUkgGbt,WC_UKG_GBT_LEN);
     }
   	}
        int localWcUkgThmCounter = -1;
        public boolean isWcUkgThmModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcUkgThmCounter != sharedCounter;
           localWcUkgThmCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcUkgThmIsNumeric() {
	      return decimalIsNumeric(beginWcUkgThm,WC_UKG_THM_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcUkgThmString() {
            return getPackedString(beginWcUkgThm,WC_UKG_THM_LEN);
         }
   protected static final int WC_UKG_THM_LEN = 9;
   protected static final int WC_UKG_THM_SCALE = 4;
  	/**
	 * 	serializeWcUkgThm
	 */
	protected void serializeWcUkgThm(BigDecimal wcUkgThm) {
		   putDecimal(beginWcUkgThm,wcUkgThm,WC_UKG_THM_LEN,WC_UKG_THM_SCALE,true);
		 localWcUkgThmCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcUkgThmMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcUkgThm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcUkgThm() throws CFException {	
   	try { 
		 return (getDecimal(beginWcUkgThm,WC_UKG_THM_LEN,WC_UKG_THM_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcUkgThm", beginWcUkgThm,WC_UKG_THM_LEN);
     }
   	}
        int localWcUkgMwhCounter = -1;
        public boolean isWcUkgMwhModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcUkgMwhCounter != sharedCounter;
           localWcUkgMwhCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcUkgMwhIsNumeric() {
	      return decimalIsNumeric(beginWcUkgMwh,WC_UKG_MWH_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcUkgMwhString() {
            return getPackedString(beginWcUkgMwh,WC_UKG_MWH_LEN);
         }
   protected static final int WC_UKG_MWH_LEN = 9;
   protected static final int WC_UKG_MWH_SCALE = 4;
  	/**
	 * 	serializeWcUkgMwh
	 */
	protected void serializeWcUkgMwh(BigDecimal wcUkgMwh) {
		   putDecimal(beginWcUkgMwh,wcUkgMwh,WC_UKG_MWH_LEN,WC_UKG_MWH_SCALE,true);
		 localWcUkgMwhCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcUkgMwhMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcUkgMwh is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcUkgMwh() throws CFException {	
   	try { 
		 return (getDecimal(beginWcUkgMwh,WC_UKG_MWH_LEN,WC_UKG_MWH_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcUkgMwh", beginWcUkgMwh,WC_UKG_MWH_LEN);
     }
   	}
        int localWcUkgGjCounter = -1;
        public boolean isWcUkgGjModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcUkgGjCounter != sharedCounter;
           localWcUkgGjCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcUkgGjIsNumeric() {
	      return decimalIsNumeric(beginWcUkgGj,WC_UKG_GJ_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcUkgGjString() {
            return getPackedString(beginWcUkgGj,WC_UKG_GJ_LEN);
         }
   protected static final int WC_UKG_GJ_LEN = 9;
   protected static final int WC_UKG_GJ_SCALE = 4;
  	/**
	 * 	serializeWcUkgGj
	 */
	protected void serializeWcUkgGj(BigDecimal wcUkgGj) {
		   putDecimal(beginWcUkgGj,wcUkgGj,WC_UKG_GJ_LEN,WC_UKG_GJ_SCALE,true);
		 localWcUkgGjCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcUkgGjMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcUkgGj is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcUkgGj() throws CFException {	
   	try { 
		 return (getDecimal(beginWcUkgGj,WC_UKG_GJ_LEN,WC_UKG_GJ_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcUkgGj", beginWcUkgGj,WC_UKG_GJ_LEN);
     }
   	}
        int localWcUkgDayCounter = -1;
        public boolean isWcUkgDayModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcUkgDayCounter != sharedCounter;
           localWcUkgDayCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcUkgDayIsNumeric() {
	      return decimalIsNumeric(beginWcUkgDay,WC_UKG_DAY_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcUkgDayString() {
            return getPackedString(beginWcUkgDay,WC_UKG_DAY_LEN);
         }
   protected static final int WC_UKG_DAY_LEN = 9;
   protected static final int WC_UKG_DAY_SCALE = 4;
  	/**
	 * 	serializeWcUkgDay
	 */
	protected void serializeWcUkgDay(BigDecimal wcUkgDay) {
		   putDecimal(beginWcUkgDay,wcUkgDay,WC_UKG_DAY_LEN,WC_UKG_DAY_SCALE,true);
		 localWcUkgDayCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcUkgDayMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcUkgDay is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcUkgDay() throws CFException {	
   	try { 
		 return (getDecimal(beginWcUkgDay,WC_UKG_DAY_LEN,WC_UKG_DAY_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcUkgDay", beginWcUkgDay,WC_UKG_DAY_LEN);
     }
   	}




}
  
