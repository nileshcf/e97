package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup56Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:07. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup56Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup56Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_56_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P1706S;
            protected  int beginIp65504P1706L;
            protected  int beginIp65504P1707S;
            protected  int beginIp65504P1707L;
            protected  int beginIp65504P1708S;
            protected  int beginIp65504P1708L;
            protected  int beginIp65504P1709S;
            protected  int beginIp65504P1709L;
            protected  int beginIp65504P1710S;
            protected  int beginIp65504P1710L;
            protected  int beginIp65504P1711S;
            protected  int beginIp65504P1711L;
            protected  int beginIp65504P1712S;
            protected  int beginIp65504P1712L;
            protected  int beginIp65504P1713S;
            protected  int beginIp65504P1713L;
            protected  int beginIp65504P1714S;
            protected  int beginIp65504P1714L;
            protected  int beginIp65504P1715S;
            protected  int beginIp65504P1715L;
            protected  int beginIp65504P1716S;
            protected  int beginIp65504P1716L;
            protected  int beginIp65504P1717S;
            protected  int beginIp65504P1717L;
            protected  int beginIp65504P1718S;
            protected  int beginIp65504P1718L;
            protected  int beginIp65504P1719S;
            protected  int beginIp65504P1719L;
            protected  int beginIp65504P1720S;
            protected  int beginIp65504P1720L;
            protected  int beginIp65504P1721S;
            protected  int beginIp65504P1721L;
            protected  int beginIp65504P1722S;
            protected  int beginIp65504P1722L;
            protected  int beginIp65504P1723S;
            protected  int beginIp65504P1723L;
            protected  int beginIp65504P1724S;
            protected  int beginIp65504P1724L;
            protected  int beginIp65504P1725S;
            protected  int beginIp65504P1725L;
            protected  int beginIp65504P1726S;
            protected  int beginIp65504P1726L;
            protected  int beginIp65504P1727S;
            protected  int beginIp65504P1727L;
            protected  int beginIp65504P1728S;
            protected  int beginIp65504P1728L;
            protected  int beginIp65504P1729S;
            protected  int beginIp65504P1729L;
            protected  int beginIp65504P1730S;
            protected  int beginIp65504P1730L;
            protected  int beginIp65504P1731S;
            protected  int beginIp65504P1731L;
            protected  int beginIp65504P1732S;
            protected  int beginIp65504P1732L;
            protected  int beginIp65504P1733S;
            protected  int beginIp65504P1733L;
            protected  int beginIp65504P1734S;
            protected  int beginIp65504P1734L;
            protected  int beginIp65504P1735S;
            protected  int beginIp65504P1735L;
            protected  int beginIp65504P1736S;
            protected  int beginIp65504P1736L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup56Serialized
	**/
    public Ip65504PdsNamesLargeGroup56Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup56Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup56Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup56Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,13636); // serialize this field at offset 13636 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup56Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 13636 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup56Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_56_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P1706S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P1706L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P1707S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P1707L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P1708S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P1708L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P1709S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P1709L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P1710S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P1710L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P1711S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P1711L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P1712S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P1712L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P1713S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P1713L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P1714S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P1714L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P1715S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P1715L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P1716S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P1716L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P1717S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P1717L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P1718S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P1718L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P1719S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P1719L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P1720S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P1720L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P1721S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P1721L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P1722S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P1722L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P1723S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P1723L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P1724S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P1724L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P1725S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P1725L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P1726S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P1726L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P1727S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P1727L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P1728S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P1728L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P1729S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P1729L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P1730S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P1730L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P1731S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P1731L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P1732S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P1732L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P1733S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P1733L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P1734S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P1734L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P1735S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P1735L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P1736S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P1736L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P1706SCounter = -1;
         public boolean isIp65504P1706SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1706SCounter != sharedCounter;
            localIp65504P1706SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1706_S_LEN = 2;
  	/**
	 * serializeIp65504P1706S
	 */
	protected void serializeIp65504P1706S(short ip65504P1706S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1706S,IP_65504_P_1706_S_LEN)
                  ,beginIp65504P1706S
                  ,IP_65504_P_1706_S_LEN
                 );
            localIp65504P1706SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1706SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1706S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1706S() {	 
			return (getShort(beginIp65504P1706S));
   	}
         int localIp65504P1706LCounter = -1;
         public boolean isIp65504P1706LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1706LCounter != sharedCounter;
            localIp65504P1706LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1706_L_LEN = 2;
  	/**
	 * serializeIp65504P1706L
	 */
	protected void serializeIp65504P1706L(short ip65504P1706L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1706L,IP_65504_P_1706_L_LEN)
                  ,beginIp65504P1706L
                  ,IP_65504_P_1706_L_LEN
                 );
            localIp65504P1706LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1706LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1706L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1706L() {	 
			return (getShort(beginIp65504P1706L));
   	}
         int localIp65504P1707SCounter = -1;
         public boolean isIp65504P1707SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1707SCounter != sharedCounter;
            localIp65504P1707SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1707_S_LEN = 2;
  	/**
	 * serializeIp65504P1707S
	 */
	protected void serializeIp65504P1707S(short ip65504P1707S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1707S,IP_65504_P_1707_S_LEN)
                  ,beginIp65504P1707S
                  ,IP_65504_P_1707_S_LEN
                 );
            localIp65504P1707SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1707SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1707S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1707S() {	 
			return (getShort(beginIp65504P1707S));
   	}
         int localIp65504P1707LCounter = -1;
         public boolean isIp65504P1707LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1707LCounter != sharedCounter;
            localIp65504P1707LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1707_L_LEN = 2;
  	/**
	 * serializeIp65504P1707L
	 */
	protected void serializeIp65504P1707L(short ip65504P1707L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1707L,IP_65504_P_1707_L_LEN)
                  ,beginIp65504P1707L
                  ,IP_65504_P_1707_L_LEN
                 );
            localIp65504P1707LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1707LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1707L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1707L() {	 
			return (getShort(beginIp65504P1707L));
   	}
         int localIp65504P1708SCounter = -1;
         public boolean isIp65504P1708SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1708SCounter != sharedCounter;
            localIp65504P1708SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1708_S_LEN = 2;
  	/**
	 * serializeIp65504P1708S
	 */
	protected void serializeIp65504P1708S(short ip65504P1708S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1708S,IP_65504_P_1708_S_LEN)
                  ,beginIp65504P1708S
                  ,IP_65504_P_1708_S_LEN
                 );
            localIp65504P1708SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1708SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1708S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1708S() {	 
			return (getShort(beginIp65504P1708S));
   	}
         int localIp65504P1708LCounter = -1;
         public boolean isIp65504P1708LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1708LCounter != sharedCounter;
            localIp65504P1708LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1708_L_LEN = 2;
  	/**
	 * serializeIp65504P1708L
	 */
	protected void serializeIp65504P1708L(short ip65504P1708L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1708L,IP_65504_P_1708_L_LEN)
                  ,beginIp65504P1708L
                  ,IP_65504_P_1708_L_LEN
                 );
            localIp65504P1708LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1708LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1708L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1708L() {	 
			return (getShort(beginIp65504P1708L));
   	}
         int localIp65504P1709SCounter = -1;
         public boolean isIp65504P1709SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1709SCounter != sharedCounter;
            localIp65504P1709SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1709_S_LEN = 2;
  	/**
	 * serializeIp65504P1709S
	 */
	protected void serializeIp65504P1709S(short ip65504P1709S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1709S,IP_65504_P_1709_S_LEN)
                  ,beginIp65504P1709S
                  ,IP_65504_P_1709_S_LEN
                 );
            localIp65504P1709SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1709SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1709S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1709S() {	 
			return (getShort(beginIp65504P1709S));
   	}
         int localIp65504P1709LCounter = -1;
         public boolean isIp65504P1709LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1709LCounter != sharedCounter;
            localIp65504P1709LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1709_L_LEN = 2;
  	/**
	 * serializeIp65504P1709L
	 */
	protected void serializeIp65504P1709L(short ip65504P1709L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1709L,IP_65504_P_1709_L_LEN)
                  ,beginIp65504P1709L
                  ,IP_65504_P_1709_L_LEN
                 );
            localIp65504P1709LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1709LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1709L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1709L() {	 
			return (getShort(beginIp65504P1709L));
   	}
         int localIp65504P1710SCounter = -1;
         public boolean isIp65504P1710SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1710SCounter != sharedCounter;
            localIp65504P1710SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1710_S_LEN = 2;
  	/**
	 * serializeIp65504P1710S
	 */
	protected void serializeIp65504P1710S(short ip65504P1710S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1710S,IP_65504_P_1710_S_LEN)
                  ,beginIp65504P1710S
                  ,IP_65504_P_1710_S_LEN
                 );
            localIp65504P1710SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1710SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1710S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1710S() {	 
			return (getShort(beginIp65504P1710S));
   	}
         int localIp65504P1710LCounter = -1;
         public boolean isIp65504P1710LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1710LCounter != sharedCounter;
            localIp65504P1710LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1710_L_LEN = 2;
  	/**
	 * serializeIp65504P1710L
	 */
	protected void serializeIp65504P1710L(short ip65504P1710L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1710L,IP_65504_P_1710_L_LEN)
                  ,beginIp65504P1710L
                  ,IP_65504_P_1710_L_LEN
                 );
            localIp65504P1710LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1710LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1710L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1710L() {	 
			return (getShort(beginIp65504P1710L));
   	}
         int localIp65504P1711SCounter = -1;
         public boolean isIp65504P1711SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1711SCounter != sharedCounter;
            localIp65504P1711SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1711_S_LEN = 2;
  	/**
	 * serializeIp65504P1711S
	 */
	protected void serializeIp65504P1711S(short ip65504P1711S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1711S,IP_65504_P_1711_S_LEN)
                  ,beginIp65504P1711S
                  ,IP_65504_P_1711_S_LEN
                 );
            localIp65504P1711SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1711SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1711S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1711S() {	 
			return (getShort(beginIp65504P1711S));
   	}
         int localIp65504P1711LCounter = -1;
         public boolean isIp65504P1711LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1711LCounter != sharedCounter;
            localIp65504P1711LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1711_L_LEN = 2;
  	/**
	 * serializeIp65504P1711L
	 */
	protected void serializeIp65504P1711L(short ip65504P1711L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1711L,IP_65504_P_1711_L_LEN)
                  ,beginIp65504P1711L
                  ,IP_65504_P_1711_L_LEN
                 );
            localIp65504P1711LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1711LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1711L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1711L() {	 
			return (getShort(beginIp65504P1711L));
   	}
         int localIp65504P1712SCounter = -1;
         public boolean isIp65504P1712SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1712SCounter != sharedCounter;
            localIp65504P1712SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1712_S_LEN = 2;
  	/**
	 * serializeIp65504P1712S
	 */
	protected void serializeIp65504P1712S(short ip65504P1712S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1712S,IP_65504_P_1712_S_LEN)
                  ,beginIp65504P1712S
                  ,IP_65504_P_1712_S_LEN
                 );
            localIp65504P1712SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1712SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1712S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1712S() {	 
			return (getShort(beginIp65504P1712S));
   	}
         int localIp65504P1712LCounter = -1;
         public boolean isIp65504P1712LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1712LCounter != sharedCounter;
            localIp65504P1712LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1712_L_LEN = 2;
  	/**
	 * serializeIp65504P1712L
	 */
	protected void serializeIp65504P1712L(short ip65504P1712L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1712L,IP_65504_P_1712_L_LEN)
                  ,beginIp65504P1712L
                  ,IP_65504_P_1712_L_LEN
                 );
            localIp65504P1712LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1712LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1712L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1712L() {	 
			return (getShort(beginIp65504P1712L));
   	}
         int localIp65504P1713SCounter = -1;
         public boolean isIp65504P1713SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1713SCounter != sharedCounter;
            localIp65504P1713SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1713_S_LEN = 2;
  	/**
	 * serializeIp65504P1713S
	 */
	protected void serializeIp65504P1713S(short ip65504P1713S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1713S,IP_65504_P_1713_S_LEN)
                  ,beginIp65504P1713S
                  ,IP_65504_P_1713_S_LEN
                 );
            localIp65504P1713SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1713SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1713S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1713S() {	 
			return (getShort(beginIp65504P1713S));
   	}
         int localIp65504P1713LCounter = -1;
         public boolean isIp65504P1713LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1713LCounter != sharedCounter;
            localIp65504P1713LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1713_L_LEN = 2;
  	/**
	 * serializeIp65504P1713L
	 */
	protected void serializeIp65504P1713L(short ip65504P1713L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1713L,IP_65504_P_1713_L_LEN)
                  ,beginIp65504P1713L
                  ,IP_65504_P_1713_L_LEN
                 );
            localIp65504P1713LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1713LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1713L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1713L() {	 
			return (getShort(beginIp65504P1713L));
   	}
         int localIp65504P1714SCounter = -1;
         public boolean isIp65504P1714SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1714SCounter != sharedCounter;
            localIp65504P1714SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1714_S_LEN = 2;
  	/**
	 * serializeIp65504P1714S
	 */
	protected void serializeIp65504P1714S(short ip65504P1714S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1714S,IP_65504_P_1714_S_LEN)
                  ,beginIp65504P1714S
                  ,IP_65504_P_1714_S_LEN
                 );
            localIp65504P1714SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1714SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1714S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1714S() {	 
			return (getShort(beginIp65504P1714S));
   	}
         int localIp65504P1714LCounter = -1;
         public boolean isIp65504P1714LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1714LCounter != sharedCounter;
            localIp65504P1714LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1714_L_LEN = 2;
  	/**
	 * serializeIp65504P1714L
	 */
	protected void serializeIp65504P1714L(short ip65504P1714L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1714L,IP_65504_P_1714_L_LEN)
                  ,beginIp65504P1714L
                  ,IP_65504_P_1714_L_LEN
                 );
            localIp65504P1714LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1714LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1714L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1714L() {	 
			return (getShort(beginIp65504P1714L));
   	}
         int localIp65504P1715SCounter = -1;
         public boolean isIp65504P1715SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1715SCounter != sharedCounter;
            localIp65504P1715SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1715_S_LEN = 2;
  	/**
	 * serializeIp65504P1715S
	 */
	protected void serializeIp65504P1715S(short ip65504P1715S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1715S,IP_65504_P_1715_S_LEN)
                  ,beginIp65504P1715S
                  ,IP_65504_P_1715_S_LEN
                 );
            localIp65504P1715SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1715SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1715S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1715S() {	 
			return (getShort(beginIp65504P1715S));
   	}
         int localIp65504P1715LCounter = -1;
         public boolean isIp65504P1715LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1715LCounter != sharedCounter;
            localIp65504P1715LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1715_L_LEN = 2;
  	/**
	 * serializeIp65504P1715L
	 */
	protected void serializeIp65504P1715L(short ip65504P1715L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1715L,IP_65504_P_1715_L_LEN)
                  ,beginIp65504P1715L
                  ,IP_65504_P_1715_L_LEN
                 );
            localIp65504P1715LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1715LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1715L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1715L() {	 
			return (getShort(beginIp65504P1715L));
   	}
         int localIp65504P1716SCounter = -1;
         public boolean isIp65504P1716SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1716SCounter != sharedCounter;
            localIp65504P1716SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1716_S_LEN = 2;
  	/**
	 * serializeIp65504P1716S
	 */
	protected void serializeIp65504P1716S(short ip65504P1716S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1716S,IP_65504_P_1716_S_LEN)
                  ,beginIp65504P1716S
                  ,IP_65504_P_1716_S_LEN
                 );
            localIp65504P1716SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1716SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1716S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1716S() {	 
			return (getShort(beginIp65504P1716S));
   	}
         int localIp65504P1716LCounter = -1;
         public boolean isIp65504P1716LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1716LCounter != sharedCounter;
            localIp65504P1716LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1716_L_LEN = 2;
  	/**
	 * serializeIp65504P1716L
	 */
	protected void serializeIp65504P1716L(short ip65504P1716L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1716L,IP_65504_P_1716_L_LEN)
                  ,beginIp65504P1716L
                  ,IP_65504_P_1716_L_LEN
                 );
            localIp65504P1716LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1716LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1716L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1716L() {	 
			return (getShort(beginIp65504P1716L));
   	}
         int localIp65504P1717SCounter = -1;
         public boolean isIp65504P1717SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1717SCounter != sharedCounter;
            localIp65504P1717SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1717_S_LEN = 2;
  	/**
	 * serializeIp65504P1717S
	 */
	protected void serializeIp65504P1717S(short ip65504P1717S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1717S,IP_65504_P_1717_S_LEN)
                  ,beginIp65504P1717S
                  ,IP_65504_P_1717_S_LEN
                 );
            localIp65504P1717SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1717SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1717S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1717S() {	 
			return (getShort(beginIp65504P1717S));
   	}
         int localIp65504P1717LCounter = -1;
         public boolean isIp65504P1717LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1717LCounter != sharedCounter;
            localIp65504P1717LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1717_L_LEN = 2;
  	/**
	 * serializeIp65504P1717L
	 */
	protected void serializeIp65504P1717L(short ip65504P1717L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1717L,IP_65504_P_1717_L_LEN)
                  ,beginIp65504P1717L
                  ,IP_65504_P_1717_L_LEN
                 );
            localIp65504P1717LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1717LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1717L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1717L() {	 
			return (getShort(beginIp65504P1717L));
   	}
         int localIp65504P1718SCounter = -1;
         public boolean isIp65504P1718SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1718SCounter != sharedCounter;
            localIp65504P1718SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1718_S_LEN = 2;
  	/**
	 * serializeIp65504P1718S
	 */
	protected void serializeIp65504P1718S(short ip65504P1718S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1718S,IP_65504_P_1718_S_LEN)
                  ,beginIp65504P1718S
                  ,IP_65504_P_1718_S_LEN
                 );
            localIp65504P1718SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1718SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1718S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1718S() {	 
			return (getShort(beginIp65504P1718S));
   	}
         int localIp65504P1718LCounter = -1;
         public boolean isIp65504P1718LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1718LCounter != sharedCounter;
            localIp65504P1718LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1718_L_LEN = 2;
  	/**
	 * serializeIp65504P1718L
	 */
	protected void serializeIp65504P1718L(short ip65504P1718L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1718L,IP_65504_P_1718_L_LEN)
                  ,beginIp65504P1718L
                  ,IP_65504_P_1718_L_LEN
                 );
            localIp65504P1718LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1718LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1718L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1718L() {	 
			return (getShort(beginIp65504P1718L));
   	}
         int localIp65504P1719SCounter = -1;
         public boolean isIp65504P1719SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1719SCounter != sharedCounter;
            localIp65504P1719SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1719_S_LEN = 2;
  	/**
	 * serializeIp65504P1719S
	 */
	protected void serializeIp65504P1719S(short ip65504P1719S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1719S,IP_65504_P_1719_S_LEN)
                  ,beginIp65504P1719S
                  ,IP_65504_P_1719_S_LEN
                 );
            localIp65504P1719SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1719SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1719S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1719S() {	 
			return (getShort(beginIp65504P1719S));
   	}
         int localIp65504P1719LCounter = -1;
         public boolean isIp65504P1719LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1719LCounter != sharedCounter;
            localIp65504P1719LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1719_L_LEN = 2;
  	/**
	 * serializeIp65504P1719L
	 */
	protected void serializeIp65504P1719L(short ip65504P1719L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1719L,IP_65504_P_1719_L_LEN)
                  ,beginIp65504P1719L
                  ,IP_65504_P_1719_L_LEN
                 );
            localIp65504P1719LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1719LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1719L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1719L() {	 
			return (getShort(beginIp65504P1719L));
   	}
         int localIp65504P1720SCounter = -1;
         public boolean isIp65504P1720SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1720SCounter != sharedCounter;
            localIp65504P1720SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1720_S_LEN = 2;
  	/**
	 * serializeIp65504P1720S
	 */
	protected void serializeIp65504P1720S(short ip65504P1720S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1720S,IP_65504_P_1720_S_LEN)
                  ,beginIp65504P1720S
                  ,IP_65504_P_1720_S_LEN
                 );
            localIp65504P1720SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1720SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1720S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1720S() {	 
			return (getShort(beginIp65504P1720S));
   	}
         int localIp65504P1720LCounter = -1;
         public boolean isIp65504P1720LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1720LCounter != sharedCounter;
            localIp65504P1720LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1720_L_LEN = 2;
  	/**
	 * serializeIp65504P1720L
	 */
	protected void serializeIp65504P1720L(short ip65504P1720L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1720L,IP_65504_P_1720_L_LEN)
                  ,beginIp65504P1720L
                  ,IP_65504_P_1720_L_LEN
                 );
            localIp65504P1720LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1720LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1720L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1720L() {	 
			return (getShort(beginIp65504P1720L));
   	}
         int localIp65504P1721SCounter = -1;
         public boolean isIp65504P1721SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1721SCounter != sharedCounter;
            localIp65504P1721SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1721_S_LEN = 2;
  	/**
	 * serializeIp65504P1721S
	 */
	protected void serializeIp65504P1721S(short ip65504P1721S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1721S,IP_65504_P_1721_S_LEN)
                  ,beginIp65504P1721S
                  ,IP_65504_P_1721_S_LEN
                 );
            localIp65504P1721SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1721SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1721S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1721S() {	 
			return (getShort(beginIp65504P1721S));
   	}
         int localIp65504P1721LCounter = -1;
         public boolean isIp65504P1721LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1721LCounter != sharedCounter;
            localIp65504P1721LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1721_L_LEN = 2;
  	/**
	 * serializeIp65504P1721L
	 */
	protected void serializeIp65504P1721L(short ip65504P1721L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1721L,IP_65504_P_1721_L_LEN)
                  ,beginIp65504P1721L
                  ,IP_65504_P_1721_L_LEN
                 );
            localIp65504P1721LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1721LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1721L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1721L() {	 
			return (getShort(beginIp65504P1721L));
   	}
         int localIp65504P1722SCounter = -1;
         public boolean isIp65504P1722SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1722SCounter != sharedCounter;
            localIp65504P1722SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1722_S_LEN = 2;
  	/**
	 * serializeIp65504P1722S
	 */
	protected void serializeIp65504P1722S(short ip65504P1722S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1722S,IP_65504_P_1722_S_LEN)
                  ,beginIp65504P1722S
                  ,IP_65504_P_1722_S_LEN
                 );
            localIp65504P1722SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1722SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1722S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1722S() {	 
			return (getShort(beginIp65504P1722S));
   	}
         int localIp65504P1722LCounter = -1;
         public boolean isIp65504P1722LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1722LCounter != sharedCounter;
            localIp65504P1722LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1722_L_LEN = 2;
  	/**
	 * serializeIp65504P1722L
	 */
	protected void serializeIp65504P1722L(short ip65504P1722L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1722L,IP_65504_P_1722_L_LEN)
                  ,beginIp65504P1722L
                  ,IP_65504_P_1722_L_LEN
                 );
            localIp65504P1722LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1722LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1722L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1722L() {	 
			return (getShort(beginIp65504P1722L));
   	}
         int localIp65504P1723SCounter = -1;
         public boolean isIp65504P1723SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1723SCounter != sharedCounter;
            localIp65504P1723SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1723_S_LEN = 2;
  	/**
	 * serializeIp65504P1723S
	 */
	protected void serializeIp65504P1723S(short ip65504P1723S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1723S,IP_65504_P_1723_S_LEN)
                  ,beginIp65504P1723S
                  ,IP_65504_P_1723_S_LEN
                 );
            localIp65504P1723SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1723SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1723S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1723S() {	 
			return (getShort(beginIp65504P1723S));
   	}
         int localIp65504P1723LCounter = -1;
         public boolean isIp65504P1723LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1723LCounter != sharedCounter;
            localIp65504P1723LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1723_L_LEN = 2;
  	/**
	 * serializeIp65504P1723L
	 */
	protected void serializeIp65504P1723L(short ip65504P1723L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1723L,IP_65504_P_1723_L_LEN)
                  ,beginIp65504P1723L
                  ,IP_65504_P_1723_L_LEN
                 );
            localIp65504P1723LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1723LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1723L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1723L() {	 
			return (getShort(beginIp65504P1723L));
   	}
         int localIp65504P1724SCounter = -1;
         public boolean isIp65504P1724SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1724SCounter != sharedCounter;
            localIp65504P1724SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1724_S_LEN = 2;
  	/**
	 * serializeIp65504P1724S
	 */
	protected void serializeIp65504P1724S(short ip65504P1724S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1724S,IP_65504_P_1724_S_LEN)
                  ,beginIp65504P1724S
                  ,IP_65504_P_1724_S_LEN
                 );
            localIp65504P1724SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1724SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1724S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1724S() {	 
			return (getShort(beginIp65504P1724S));
   	}
         int localIp65504P1724LCounter = -1;
         public boolean isIp65504P1724LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1724LCounter != sharedCounter;
            localIp65504P1724LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1724_L_LEN = 2;
  	/**
	 * serializeIp65504P1724L
	 */
	protected void serializeIp65504P1724L(short ip65504P1724L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1724L,IP_65504_P_1724_L_LEN)
                  ,beginIp65504P1724L
                  ,IP_65504_P_1724_L_LEN
                 );
            localIp65504P1724LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1724LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1724L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1724L() {	 
			return (getShort(beginIp65504P1724L));
   	}
         int localIp65504P1725SCounter = -1;
         public boolean isIp65504P1725SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1725SCounter != sharedCounter;
            localIp65504P1725SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1725_S_LEN = 2;
  	/**
	 * serializeIp65504P1725S
	 */
	protected void serializeIp65504P1725S(short ip65504P1725S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1725S,IP_65504_P_1725_S_LEN)
                  ,beginIp65504P1725S
                  ,IP_65504_P_1725_S_LEN
                 );
            localIp65504P1725SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1725SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1725S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1725S() {	 
			return (getShort(beginIp65504P1725S));
   	}
         int localIp65504P1725LCounter = -1;
         public boolean isIp65504P1725LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1725LCounter != sharedCounter;
            localIp65504P1725LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1725_L_LEN = 2;
  	/**
	 * serializeIp65504P1725L
	 */
	protected void serializeIp65504P1725L(short ip65504P1725L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1725L,IP_65504_P_1725_L_LEN)
                  ,beginIp65504P1725L
                  ,IP_65504_P_1725_L_LEN
                 );
            localIp65504P1725LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1725LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1725L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1725L() {	 
			return (getShort(beginIp65504P1725L));
   	}
         int localIp65504P1726SCounter = -1;
         public boolean isIp65504P1726SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1726SCounter != sharedCounter;
            localIp65504P1726SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1726_S_LEN = 2;
  	/**
	 * serializeIp65504P1726S
	 */
	protected void serializeIp65504P1726S(short ip65504P1726S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1726S,IP_65504_P_1726_S_LEN)
                  ,beginIp65504P1726S
                  ,IP_65504_P_1726_S_LEN
                 );
            localIp65504P1726SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1726SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1726S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1726S() {	 
			return (getShort(beginIp65504P1726S));
   	}
         int localIp65504P1726LCounter = -1;
         public boolean isIp65504P1726LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1726LCounter != sharedCounter;
            localIp65504P1726LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1726_L_LEN = 2;
  	/**
	 * serializeIp65504P1726L
	 */
	protected void serializeIp65504P1726L(short ip65504P1726L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1726L,IP_65504_P_1726_L_LEN)
                  ,beginIp65504P1726L
                  ,IP_65504_P_1726_L_LEN
                 );
            localIp65504P1726LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1726LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1726L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1726L() {	 
			return (getShort(beginIp65504P1726L));
   	}
         int localIp65504P1727SCounter = -1;
         public boolean isIp65504P1727SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1727SCounter != sharedCounter;
            localIp65504P1727SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1727_S_LEN = 2;
  	/**
	 * serializeIp65504P1727S
	 */
	protected void serializeIp65504P1727S(short ip65504P1727S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1727S,IP_65504_P_1727_S_LEN)
                  ,beginIp65504P1727S
                  ,IP_65504_P_1727_S_LEN
                 );
            localIp65504P1727SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1727SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1727S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1727S() {	 
			return (getShort(beginIp65504P1727S));
   	}
         int localIp65504P1727LCounter = -1;
         public boolean isIp65504P1727LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1727LCounter != sharedCounter;
            localIp65504P1727LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1727_L_LEN = 2;
  	/**
	 * serializeIp65504P1727L
	 */
	protected void serializeIp65504P1727L(short ip65504P1727L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1727L,IP_65504_P_1727_L_LEN)
                  ,beginIp65504P1727L
                  ,IP_65504_P_1727_L_LEN
                 );
            localIp65504P1727LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1727LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1727L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1727L() {	 
			return (getShort(beginIp65504P1727L));
   	}
         int localIp65504P1728SCounter = -1;
         public boolean isIp65504P1728SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1728SCounter != sharedCounter;
            localIp65504P1728SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1728_S_LEN = 2;
  	/**
	 * serializeIp65504P1728S
	 */
	protected void serializeIp65504P1728S(short ip65504P1728S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1728S,IP_65504_P_1728_S_LEN)
                  ,beginIp65504P1728S
                  ,IP_65504_P_1728_S_LEN
                 );
            localIp65504P1728SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1728SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1728S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1728S() {	 
			return (getShort(beginIp65504P1728S));
   	}
         int localIp65504P1728LCounter = -1;
         public boolean isIp65504P1728LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1728LCounter != sharedCounter;
            localIp65504P1728LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1728_L_LEN = 2;
  	/**
	 * serializeIp65504P1728L
	 */
	protected void serializeIp65504P1728L(short ip65504P1728L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1728L,IP_65504_P_1728_L_LEN)
                  ,beginIp65504P1728L
                  ,IP_65504_P_1728_L_LEN
                 );
            localIp65504P1728LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1728LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1728L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1728L() {	 
			return (getShort(beginIp65504P1728L));
   	}
         int localIp65504P1729SCounter = -1;
         public boolean isIp65504P1729SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1729SCounter != sharedCounter;
            localIp65504P1729SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1729_S_LEN = 2;
  	/**
	 * serializeIp65504P1729S
	 */
	protected void serializeIp65504P1729S(short ip65504P1729S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1729S,IP_65504_P_1729_S_LEN)
                  ,beginIp65504P1729S
                  ,IP_65504_P_1729_S_LEN
                 );
            localIp65504P1729SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1729SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1729S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1729S() {	 
			return (getShort(beginIp65504P1729S));
   	}
         int localIp65504P1729LCounter = -1;
         public boolean isIp65504P1729LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1729LCounter != sharedCounter;
            localIp65504P1729LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1729_L_LEN = 2;
  	/**
	 * serializeIp65504P1729L
	 */
	protected void serializeIp65504P1729L(short ip65504P1729L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1729L,IP_65504_P_1729_L_LEN)
                  ,beginIp65504P1729L
                  ,IP_65504_P_1729_L_LEN
                 );
            localIp65504P1729LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1729LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1729L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1729L() {	 
			return (getShort(beginIp65504P1729L));
   	}
         int localIp65504P1730SCounter = -1;
         public boolean isIp65504P1730SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1730SCounter != sharedCounter;
            localIp65504P1730SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1730_S_LEN = 2;
  	/**
	 * serializeIp65504P1730S
	 */
	protected void serializeIp65504P1730S(short ip65504P1730S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1730S,IP_65504_P_1730_S_LEN)
                  ,beginIp65504P1730S
                  ,IP_65504_P_1730_S_LEN
                 );
            localIp65504P1730SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1730SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1730S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1730S() {	 
			return (getShort(beginIp65504P1730S));
   	}
         int localIp65504P1730LCounter = -1;
         public boolean isIp65504P1730LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1730LCounter != sharedCounter;
            localIp65504P1730LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1730_L_LEN = 2;
  	/**
	 * serializeIp65504P1730L
	 */
	protected void serializeIp65504P1730L(short ip65504P1730L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1730L,IP_65504_P_1730_L_LEN)
                  ,beginIp65504P1730L
                  ,IP_65504_P_1730_L_LEN
                 );
            localIp65504P1730LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1730LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1730L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1730L() {	 
			return (getShort(beginIp65504P1730L));
   	}
         int localIp65504P1731SCounter = -1;
         public boolean isIp65504P1731SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1731SCounter != sharedCounter;
            localIp65504P1731SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1731_S_LEN = 2;
  	/**
	 * serializeIp65504P1731S
	 */
	protected void serializeIp65504P1731S(short ip65504P1731S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1731S,IP_65504_P_1731_S_LEN)
                  ,beginIp65504P1731S
                  ,IP_65504_P_1731_S_LEN
                 );
            localIp65504P1731SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1731SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1731S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1731S() {	 
			return (getShort(beginIp65504P1731S));
   	}
         int localIp65504P1731LCounter = -1;
         public boolean isIp65504P1731LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1731LCounter != sharedCounter;
            localIp65504P1731LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1731_L_LEN = 2;
  	/**
	 * serializeIp65504P1731L
	 */
	protected void serializeIp65504P1731L(short ip65504P1731L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1731L,IP_65504_P_1731_L_LEN)
                  ,beginIp65504P1731L
                  ,IP_65504_P_1731_L_LEN
                 );
            localIp65504P1731LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1731LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1731L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1731L() {	 
			return (getShort(beginIp65504P1731L));
   	}
         int localIp65504P1732SCounter = -1;
         public boolean isIp65504P1732SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1732SCounter != sharedCounter;
            localIp65504P1732SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1732_S_LEN = 2;
  	/**
	 * serializeIp65504P1732S
	 */
	protected void serializeIp65504P1732S(short ip65504P1732S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1732S,IP_65504_P_1732_S_LEN)
                  ,beginIp65504P1732S
                  ,IP_65504_P_1732_S_LEN
                 );
            localIp65504P1732SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1732SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1732S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1732S() {	 
			return (getShort(beginIp65504P1732S));
   	}
         int localIp65504P1732LCounter = -1;
         public boolean isIp65504P1732LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1732LCounter != sharedCounter;
            localIp65504P1732LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1732_L_LEN = 2;
  	/**
	 * serializeIp65504P1732L
	 */
	protected void serializeIp65504P1732L(short ip65504P1732L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1732L,IP_65504_P_1732_L_LEN)
                  ,beginIp65504P1732L
                  ,IP_65504_P_1732_L_LEN
                 );
            localIp65504P1732LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1732LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1732L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1732L() {	 
			return (getShort(beginIp65504P1732L));
   	}
         int localIp65504P1733SCounter = -1;
         public boolean isIp65504P1733SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1733SCounter != sharedCounter;
            localIp65504P1733SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1733_S_LEN = 2;
  	/**
	 * serializeIp65504P1733S
	 */
	protected void serializeIp65504P1733S(short ip65504P1733S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1733S,IP_65504_P_1733_S_LEN)
                  ,beginIp65504P1733S
                  ,IP_65504_P_1733_S_LEN
                 );
            localIp65504P1733SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1733SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1733S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1733S() {	 
			return (getShort(beginIp65504P1733S));
   	}
         int localIp65504P1733LCounter = -1;
         public boolean isIp65504P1733LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1733LCounter != sharedCounter;
            localIp65504P1733LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1733_L_LEN = 2;
  	/**
	 * serializeIp65504P1733L
	 */
	protected void serializeIp65504P1733L(short ip65504P1733L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1733L,IP_65504_P_1733_L_LEN)
                  ,beginIp65504P1733L
                  ,IP_65504_P_1733_L_LEN
                 );
            localIp65504P1733LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1733LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1733L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1733L() {	 
			return (getShort(beginIp65504P1733L));
   	}
         int localIp65504P1734SCounter = -1;
         public boolean isIp65504P1734SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1734SCounter != sharedCounter;
            localIp65504P1734SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1734_S_LEN = 2;
  	/**
	 * serializeIp65504P1734S
	 */
	protected void serializeIp65504P1734S(short ip65504P1734S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1734S,IP_65504_P_1734_S_LEN)
                  ,beginIp65504P1734S
                  ,IP_65504_P_1734_S_LEN
                 );
            localIp65504P1734SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1734SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1734S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1734S() {	 
			return (getShort(beginIp65504P1734S));
   	}
         int localIp65504P1734LCounter = -1;
         public boolean isIp65504P1734LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1734LCounter != sharedCounter;
            localIp65504P1734LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1734_L_LEN = 2;
  	/**
	 * serializeIp65504P1734L
	 */
	protected void serializeIp65504P1734L(short ip65504P1734L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1734L,IP_65504_P_1734_L_LEN)
                  ,beginIp65504P1734L
                  ,IP_65504_P_1734_L_LEN
                 );
            localIp65504P1734LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1734LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1734L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1734L() {	 
			return (getShort(beginIp65504P1734L));
   	}
         int localIp65504P1735SCounter = -1;
         public boolean isIp65504P1735SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1735SCounter != sharedCounter;
            localIp65504P1735SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1735_S_LEN = 2;
  	/**
	 * serializeIp65504P1735S
	 */
	protected void serializeIp65504P1735S(short ip65504P1735S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1735S,IP_65504_P_1735_S_LEN)
                  ,beginIp65504P1735S
                  ,IP_65504_P_1735_S_LEN
                 );
            localIp65504P1735SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1735SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1735S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1735S() {	 
			return (getShort(beginIp65504P1735S));
   	}
         int localIp65504P1735LCounter = -1;
         public boolean isIp65504P1735LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1735LCounter != sharedCounter;
            localIp65504P1735LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1735_L_LEN = 2;
  	/**
	 * serializeIp65504P1735L
	 */
	protected void serializeIp65504P1735L(short ip65504P1735L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1735L,IP_65504_P_1735_L_LEN)
                  ,beginIp65504P1735L
                  ,IP_65504_P_1735_L_LEN
                 );
            localIp65504P1735LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1735LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1735L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1735L() {	 
			return (getShort(beginIp65504P1735L));
   	}
         int localIp65504P1736SCounter = -1;
         public boolean isIp65504P1736SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1736SCounter != sharedCounter;
            localIp65504P1736SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1736_S_LEN = 2;
  	/**
	 * serializeIp65504P1736S
	 */
	protected void serializeIp65504P1736S(short ip65504P1736S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1736S,IP_65504_P_1736_S_LEN)
                  ,beginIp65504P1736S
                  ,IP_65504_P_1736_S_LEN
                 );
            localIp65504P1736SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1736SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1736S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1736S() {	 
			return (getShort(beginIp65504P1736S));
   	}
         int localIp65504P1736LCounter = -1;
         public boolean isIp65504P1736LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1736LCounter != sharedCounter;
            localIp65504P1736LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1736_L_LEN = 2;
  	/**
	 * serializeIp65504P1736L
	 */
	protected void serializeIp65504P1736L(short ip65504P1736L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1736L,IP_65504_P_1736_L_LEN)
                  ,beginIp65504P1736L
                  ,IP_65504_P_1736_L_LEN
                 );
            localIp65504P1736LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1736LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1736L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1736L() {	 
			return (getShort(beginIp65504P1736L));
   	}




}
  
