package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup75Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:08. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup75Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup75Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_75_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P2295S;
            protected  int beginIp65504P2295L;
            protected  int beginIp65504P2296S;
            protected  int beginIp65504P2296L;
            protected  int beginIp65504P2297S;
            protected  int beginIp65504P2297L;
            protected  int beginIp65504P2298S;
            protected  int beginIp65504P2298L;
            protected  int beginIp65504P2299S;
            protected  int beginIp65504P2299L;
            protected  int beginIp65504P2300S;
            protected  int beginIp65504P2300L;
            protected  int beginIp65504P2301S;
            protected  int beginIp65504P2301L;
            protected  int beginIp65504P2302S;
            protected  int beginIp65504P2302L;
            protected  int beginIp65504P2303S;
            protected  int beginIp65504P2303L;
            protected  int beginIp65504P2304S;
            protected  int beginIp65504P2304L;
            protected  int beginIp65504P2305S;
            protected  int beginIp65504P2305L;
            protected  int beginIp65504P2306S;
            protected  int beginIp65504P2306L;
            protected  int beginIp65504P2307S;
            protected  int beginIp65504P2307L;
            protected  int beginIp65504P2308S;
            protected  int beginIp65504P2308L;
            protected  int beginIp65504P2309S;
            protected  int beginIp65504P2309L;
            protected  int beginIp65504P2310S;
            protected  int beginIp65504P2310L;
            protected  int beginIp65504P2311S;
            protected  int beginIp65504P2311L;
            protected  int beginIp65504P2312S;
            protected  int beginIp65504P2312L;
            protected  int beginIp65504P2313S;
            protected  int beginIp65504P2313L;
            protected  int beginIp65504P2314S;
            protected  int beginIp65504P2314L;
            protected  int beginIp65504P2315S;
            protected  int beginIp65504P2315L;
            protected  int beginIp65504P2316S;
            protected  int beginIp65504P2316L;
            protected  int beginIp65504P2317S;
            protected  int beginIp65504P2317L;
            protected  int beginIp65504P2318S;
            protected  int beginIp65504P2318L;
            protected  int beginIp65504P2319S;
            protected  int beginIp65504P2319L;
            protected  int beginIp65504P2320S;
            protected  int beginIp65504P2320L;
            protected  int beginIp65504P2321S;
            protected  int beginIp65504P2321L;
            protected  int beginIp65504P2322S;
            protected  int beginIp65504P2322L;
            protected  int beginIp65504P2323S;
            protected  int beginIp65504P2323L;
            protected  int beginIp65504P2324S;
            protected  int beginIp65504P2324L;
            protected  int beginIp65504P2325S;
            protected  int beginIp65504P2325L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup75Serialized
	**/
    public Ip65504PdsNamesLargeGroup75Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup75Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup75Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup75Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,18348); // serialize this field at offset 18348 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup75Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 18348 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup75Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_75_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P2295S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P2295L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P2296S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P2296L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P2297S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P2297L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P2298S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P2298L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P2299S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P2299L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P2300S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P2300L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P2301S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P2301L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P2302S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P2302L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P2303S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P2303L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P2304S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P2304L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P2305S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P2305L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P2306S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P2306L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P2307S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P2307L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P2308S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P2308L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P2309S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P2309L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P2310S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P2310L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P2311S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P2311L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P2312S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P2312L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P2313S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P2313L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P2314S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P2314L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P2315S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P2315L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P2316S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P2316L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P2317S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P2317L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P2318S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P2318L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P2319S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P2319L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P2320S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P2320L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P2321S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P2321L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P2322S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P2322L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P2323S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P2323L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P2324S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P2324L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P2325S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P2325L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P2295SCounter = -1;
         public boolean isIp65504P2295SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2295SCounter != sharedCounter;
            localIp65504P2295SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2295_S_LEN = 2;
  	/**
	 * serializeIp65504P2295S
	 */
	protected void serializeIp65504P2295S(short ip65504P2295S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2295S,IP_65504_P_2295_S_LEN)
                  ,beginIp65504P2295S
                  ,IP_65504_P_2295_S_LEN
                 );
            localIp65504P2295SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2295SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2295S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2295S() {	 
			return (getShort(beginIp65504P2295S));
   	}
         int localIp65504P2295LCounter = -1;
         public boolean isIp65504P2295LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2295LCounter != sharedCounter;
            localIp65504P2295LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2295_L_LEN = 2;
  	/**
	 * serializeIp65504P2295L
	 */
	protected void serializeIp65504P2295L(short ip65504P2295L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2295L,IP_65504_P_2295_L_LEN)
                  ,beginIp65504P2295L
                  ,IP_65504_P_2295_L_LEN
                 );
            localIp65504P2295LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2295LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2295L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2295L() {	 
			return (getShort(beginIp65504P2295L));
   	}
         int localIp65504P2296SCounter = -1;
         public boolean isIp65504P2296SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2296SCounter != sharedCounter;
            localIp65504P2296SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2296_S_LEN = 2;
  	/**
	 * serializeIp65504P2296S
	 */
	protected void serializeIp65504P2296S(short ip65504P2296S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2296S,IP_65504_P_2296_S_LEN)
                  ,beginIp65504P2296S
                  ,IP_65504_P_2296_S_LEN
                 );
            localIp65504P2296SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2296SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2296S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2296S() {	 
			return (getShort(beginIp65504P2296S));
   	}
         int localIp65504P2296LCounter = -1;
         public boolean isIp65504P2296LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2296LCounter != sharedCounter;
            localIp65504P2296LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2296_L_LEN = 2;
  	/**
	 * serializeIp65504P2296L
	 */
	protected void serializeIp65504P2296L(short ip65504P2296L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2296L,IP_65504_P_2296_L_LEN)
                  ,beginIp65504P2296L
                  ,IP_65504_P_2296_L_LEN
                 );
            localIp65504P2296LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2296LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2296L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2296L() {	 
			return (getShort(beginIp65504P2296L));
   	}
         int localIp65504P2297SCounter = -1;
         public boolean isIp65504P2297SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2297SCounter != sharedCounter;
            localIp65504P2297SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2297_S_LEN = 2;
  	/**
	 * serializeIp65504P2297S
	 */
	protected void serializeIp65504P2297S(short ip65504P2297S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2297S,IP_65504_P_2297_S_LEN)
                  ,beginIp65504P2297S
                  ,IP_65504_P_2297_S_LEN
                 );
            localIp65504P2297SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2297SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2297S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2297S() {	 
			return (getShort(beginIp65504P2297S));
   	}
         int localIp65504P2297LCounter = -1;
         public boolean isIp65504P2297LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2297LCounter != sharedCounter;
            localIp65504P2297LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2297_L_LEN = 2;
  	/**
	 * serializeIp65504P2297L
	 */
	protected void serializeIp65504P2297L(short ip65504P2297L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2297L,IP_65504_P_2297_L_LEN)
                  ,beginIp65504P2297L
                  ,IP_65504_P_2297_L_LEN
                 );
            localIp65504P2297LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2297LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2297L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2297L() {	 
			return (getShort(beginIp65504P2297L));
   	}
         int localIp65504P2298SCounter = -1;
         public boolean isIp65504P2298SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2298SCounter != sharedCounter;
            localIp65504P2298SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2298_S_LEN = 2;
  	/**
	 * serializeIp65504P2298S
	 */
	protected void serializeIp65504P2298S(short ip65504P2298S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2298S,IP_65504_P_2298_S_LEN)
                  ,beginIp65504P2298S
                  ,IP_65504_P_2298_S_LEN
                 );
            localIp65504P2298SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2298SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2298S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2298S() {	 
			return (getShort(beginIp65504P2298S));
   	}
         int localIp65504P2298LCounter = -1;
         public boolean isIp65504P2298LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2298LCounter != sharedCounter;
            localIp65504P2298LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2298_L_LEN = 2;
  	/**
	 * serializeIp65504P2298L
	 */
	protected void serializeIp65504P2298L(short ip65504P2298L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2298L,IP_65504_P_2298_L_LEN)
                  ,beginIp65504P2298L
                  ,IP_65504_P_2298_L_LEN
                 );
            localIp65504P2298LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2298LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2298L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2298L() {	 
			return (getShort(beginIp65504P2298L));
   	}
         int localIp65504P2299SCounter = -1;
         public boolean isIp65504P2299SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2299SCounter != sharedCounter;
            localIp65504P2299SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2299_S_LEN = 2;
  	/**
	 * serializeIp65504P2299S
	 */
	protected void serializeIp65504P2299S(short ip65504P2299S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2299S,IP_65504_P_2299_S_LEN)
                  ,beginIp65504P2299S
                  ,IP_65504_P_2299_S_LEN
                 );
            localIp65504P2299SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2299SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2299S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2299S() {	 
			return (getShort(beginIp65504P2299S));
   	}
         int localIp65504P2299LCounter = -1;
         public boolean isIp65504P2299LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2299LCounter != sharedCounter;
            localIp65504P2299LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2299_L_LEN = 2;
  	/**
	 * serializeIp65504P2299L
	 */
	protected void serializeIp65504P2299L(short ip65504P2299L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2299L,IP_65504_P_2299_L_LEN)
                  ,beginIp65504P2299L
                  ,IP_65504_P_2299_L_LEN
                 );
            localIp65504P2299LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2299LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2299L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2299L() {	 
			return (getShort(beginIp65504P2299L));
   	}
         int localIp65504P2300SCounter = -1;
         public boolean isIp65504P2300SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2300SCounter != sharedCounter;
            localIp65504P2300SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2300_S_LEN = 2;
  	/**
	 * serializeIp65504P2300S
	 */
	protected void serializeIp65504P2300S(short ip65504P2300S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2300S,IP_65504_P_2300_S_LEN)
                  ,beginIp65504P2300S
                  ,IP_65504_P_2300_S_LEN
                 );
            localIp65504P2300SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2300SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2300S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2300S() {	 
			return (getShort(beginIp65504P2300S));
   	}
         int localIp65504P2300LCounter = -1;
         public boolean isIp65504P2300LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2300LCounter != sharedCounter;
            localIp65504P2300LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2300_L_LEN = 2;
  	/**
	 * serializeIp65504P2300L
	 */
	protected void serializeIp65504P2300L(short ip65504P2300L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2300L,IP_65504_P_2300_L_LEN)
                  ,beginIp65504P2300L
                  ,IP_65504_P_2300_L_LEN
                 );
            localIp65504P2300LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2300LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2300L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2300L() {	 
			return (getShort(beginIp65504P2300L));
   	}
         int localIp65504P2301SCounter = -1;
         public boolean isIp65504P2301SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2301SCounter != sharedCounter;
            localIp65504P2301SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2301_S_LEN = 2;
  	/**
	 * serializeIp65504P2301S
	 */
	protected void serializeIp65504P2301S(short ip65504P2301S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2301S,IP_65504_P_2301_S_LEN)
                  ,beginIp65504P2301S
                  ,IP_65504_P_2301_S_LEN
                 );
            localIp65504P2301SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2301SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2301S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2301S() {	 
			return (getShort(beginIp65504P2301S));
   	}
         int localIp65504P2301LCounter = -1;
         public boolean isIp65504P2301LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2301LCounter != sharedCounter;
            localIp65504P2301LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2301_L_LEN = 2;
  	/**
	 * serializeIp65504P2301L
	 */
	protected void serializeIp65504P2301L(short ip65504P2301L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2301L,IP_65504_P_2301_L_LEN)
                  ,beginIp65504P2301L
                  ,IP_65504_P_2301_L_LEN
                 );
            localIp65504P2301LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2301LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2301L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2301L() {	 
			return (getShort(beginIp65504P2301L));
   	}
         int localIp65504P2302SCounter = -1;
         public boolean isIp65504P2302SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2302SCounter != sharedCounter;
            localIp65504P2302SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2302_S_LEN = 2;
  	/**
	 * serializeIp65504P2302S
	 */
	protected void serializeIp65504P2302S(short ip65504P2302S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2302S,IP_65504_P_2302_S_LEN)
                  ,beginIp65504P2302S
                  ,IP_65504_P_2302_S_LEN
                 );
            localIp65504P2302SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2302SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2302S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2302S() {	 
			return (getShort(beginIp65504P2302S));
   	}
         int localIp65504P2302LCounter = -1;
         public boolean isIp65504P2302LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2302LCounter != sharedCounter;
            localIp65504P2302LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2302_L_LEN = 2;
  	/**
	 * serializeIp65504P2302L
	 */
	protected void serializeIp65504P2302L(short ip65504P2302L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2302L,IP_65504_P_2302_L_LEN)
                  ,beginIp65504P2302L
                  ,IP_65504_P_2302_L_LEN
                 );
            localIp65504P2302LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2302LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2302L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2302L() {	 
			return (getShort(beginIp65504P2302L));
   	}
         int localIp65504P2303SCounter = -1;
         public boolean isIp65504P2303SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2303SCounter != sharedCounter;
            localIp65504P2303SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2303_S_LEN = 2;
  	/**
	 * serializeIp65504P2303S
	 */
	protected void serializeIp65504P2303S(short ip65504P2303S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2303S,IP_65504_P_2303_S_LEN)
                  ,beginIp65504P2303S
                  ,IP_65504_P_2303_S_LEN
                 );
            localIp65504P2303SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2303SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2303S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2303S() {	 
			return (getShort(beginIp65504P2303S));
   	}
         int localIp65504P2303LCounter = -1;
         public boolean isIp65504P2303LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2303LCounter != sharedCounter;
            localIp65504P2303LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2303_L_LEN = 2;
  	/**
	 * serializeIp65504P2303L
	 */
	protected void serializeIp65504P2303L(short ip65504P2303L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2303L,IP_65504_P_2303_L_LEN)
                  ,beginIp65504P2303L
                  ,IP_65504_P_2303_L_LEN
                 );
            localIp65504P2303LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2303LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2303L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2303L() {	 
			return (getShort(beginIp65504P2303L));
   	}
         int localIp65504P2304SCounter = -1;
         public boolean isIp65504P2304SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2304SCounter != sharedCounter;
            localIp65504P2304SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2304_S_LEN = 2;
  	/**
	 * serializeIp65504P2304S
	 */
	protected void serializeIp65504P2304S(short ip65504P2304S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2304S,IP_65504_P_2304_S_LEN)
                  ,beginIp65504P2304S
                  ,IP_65504_P_2304_S_LEN
                 );
            localIp65504P2304SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2304SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2304S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2304S() {	 
			return (getShort(beginIp65504P2304S));
   	}
         int localIp65504P2304LCounter = -1;
         public boolean isIp65504P2304LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2304LCounter != sharedCounter;
            localIp65504P2304LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2304_L_LEN = 2;
  	/**
	 * serializeIp65504P2304L
	 */
	protected void serializeIp65504P2304L(short ip65504P2304L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2304L,IP_65504_P_2304_L_LEN)
                  ,beginIp65504P2304L
                  ,IP_65504_P_2304_L_LEN
                 );
            localIp65504P2304LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2304LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2304L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2304L() {	 
			return (getShort(beginIp65504P2304L));
   	}
         int localIp65504P2305SCounter = -1;
         public boolean isIp65504P2305SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2305SCounter != sharedCounter;
            localIp65504P2305SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2305_S_LEN = 2;
  	/**
	 * serializeIp65504P2305S
	 */
	protected void serializeIp65504P2305S(short ip65504P2305S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2305S,IP_65504_P_2305_S_LEN)
                  ,beginIp65504P2305S
                  ,IP_65504_P_2305_S_LEN
                 );
            localIp65504P2305SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2305SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2305S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2305S() {	 
			return (getShort(beginIp65504P2305S));
   	}
         int localIp65504P2305LCounter = -1;
         public boolean isIp65504P2305LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2305LCounter != sharedCounter;
            localIp65504P2305LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2305_L_LEN = 2;
  	/**
	 * serializeIp65504P2305L
	 */
	protected void serializeIp65504P2305L(short ip65504P2305L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2305L,IP_65504_P_2305_L_LEN)
                  ,beginIp65504P2305L
                  ,IP_65504_P_2305_L_LEN
                 );
            localIp65504P2305LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2305LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2305L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2305L() {	 
			return (getShort(beginIp65504P2305L));
   	}
         int localIp65504P2306SCounter = -1;
         public boolean isIp65504P2306SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2306SCounter != sharedCounter;
            localIp65504P2306SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2306_S_LEN = 2;
  	/**
	 * serializeIp65504P2306S
	 */
	protected void serializeIp65504P2306S(short ip65504P2306S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2306S,IP_65504_P_2306_S_LEN)
                  ,beginIp65504P2306S
                  ,IP_65504_P_2306_S_LEN
                 );
            localIp65504P2306SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2306SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2306S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2306S() {	 
			return (getShort(beginIp65504P2306S));
   	}
         int localIp65504P2306LCounter = -1;
         public boolean isIp65504P2306LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2306LCounter != sharedCounter;
            localIp65504P2306LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2306_L_LEN = 2;
  	/**
	 * serializeIp65504P2306L
	 */
	protected void serializeIp65504P2306L(short ip65504P2306L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2306L,IP_65504_P_2306_L_LEN)
                  ,beginIp65504P2306L
                  ,IP_65504_P_2306_L_LEN
                 );
            localIp65504P2306LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2306LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2306L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2306L() {	 
			return (getShort(beginIp65504P2306L));
   	}
         int localIp65504P2307SCounter = -1;
         public boolean isIp65504P2307SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2307SCounter != sharedCounter;
            localIp65504P2307SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2307_S_LEN = 2;
  	/**
	 * serializeIp65504P2307S
	 */
	protected void serializeIp65504P2307S(short ip65504P2307S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2307S,IP_65504_P_2307_S_LEN)
                  ,beginIp65504P2307S
                  ,IP_65504_P_2307_S_LEN
                 );
            localIp65504P2307SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2307SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2307S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2307S() {	 
			return (getShort(beginIp65504P2307S));
   	}
         int localIp65504P2307LCounter = -1;
         public boolean isIp65504P2307LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2307LCounter != sharedCounter;
            localIp65504P2307LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2307_L_LEN = 2;
  	/**
	 * serializeIp65504P2307L
	 */
	protected void serializeIp65504P2307L(short ip65504P2307L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2307L,IP_65504_P_2307_L_LEN)
                  ,beginIp65504P2307L
                  ,IP_65504_P_2307_L_LEN
                 );
            localIp65504P2307LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2307LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2307L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2307L() {	 
			return (getShort(beginIp65504P2307L));
   	}
         int localIp65504P2308SCounter = -1;
         public boolean isIp65504P2308SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2308SCounter != sharedCounter;
            localIp65504P2308SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2308_S_LEN = 2;
  	/**
	 * serializeIp65504P2308S
	 */
	protected void serializeIp65504P2308S(short ip65504P2308S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2308S,IP_65504_P_2308_S_LEN)
                  ,beginIp65504P2308S
                  ,IP_65504_P_2308_S_LEN
                 );
            localIp65504P2308SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2308SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2308S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2308S() {	 
			return (getShort(beginIp65504P2308S));
   	}
         int localIp65504P2308LCounter = -1;
         public boolean isIp65504P2308LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2308LCounter != sharedCounter;
            localIp65504P2308LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2308_L_LEN = 2;
  	/**
	 * serializeIp65504P2308L
	 */
	protected void serializeIp65504P2308L(short ip65504P2308L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2308L,IP_65504_P_2308_L_LEN)
                  ,beginIp65504P2308L
                  ,IP_65504_P_2308_L_LEN
                 );
            localIp65504P2308LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2308LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2308L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2308L() {	 
			return (getShort(beginIp65504P2308L));
   	}
         int localIp65504P2309SCounter = -1;
         public boolean isIp65504P2309SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2309SCounter != sharedCounter;
            localIp65504P2309SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2309_S_LEN = 2;
  	/**
	 * serializeIp65504P2309S
	 */
	protected void serializeIp65504P2309S(short ip65504P2309S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2309S,IP_65504_P_2309_S_LEN)
                  ,beginIp65504P2309S
                  ,IP_65504_P_2309_S_LEN
                 );
            localIp65504P2309SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2309SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2309S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2309S() {	 
			return (getShort(beginIp65504P2309S));
   	}
         int localIp65504P2309LCounter = -1;
         public boolean isIp65504P2309LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2309LCounter != sharedCounter;
            localIp65504P2309LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2309_L_LEN = 2;
  	/**
	 * serializeIp65504P2309L
	 */
	protected void serializeIp65504P2309L(short ip65504P2309L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2309L,IP_65504_P_2309_L_LEN)
                  ,beginIp65504P2309L
                  ,IP_65504_P_2309_L_LEN
                 );
            localIp65504P2309LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2309LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2309L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2309L() {	 
			return (getShort(beginIp65504P2309L));
   	}
         int localIp65504P2310SCounter = -1;
         public boolean isIp65504P2310SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2310SCounter != sharedCounter;
            localIp65504P2310SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2310_S_LEN = 2;
  	/**
	 * serializeIp65504P2310S
	 */
	protected void serializeIp65504P2310S(short ip65504P2310S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2310S,IP_65504_P_2310_S_LEN)
                  ,beginIp65504P2310S
                  ,IP_65504_P_2310_S_LEN
                 );
            localIp65504P2310SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2310SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2310S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2310S() {	 
			return (getShort(beginIp65504P2310S));
   	}
         int localIp65504P2310LCounter = -1;
         public boolean isIp65504P2310LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2310LCounter != sharedCounter;
            localIp65504P2310LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2310_L_LEN = 2;
  	/**
	 * serializeIp65504P2310L
	 */
	protected void serializeIp65504P2310L(short ip65504P2310L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2310L,IP_65504_P_2310_L_LEN)
                  ,beginIp65504P2310L
                  ,IP_65504_P_2310_L_LEN
                 );
            localIp65504P2310LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2310LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2310L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2310L() {	 
			return (getShort(beginIp65504P2310L));
   	}
         int localIp65504P2311SCounter = -1;
         public boolean isIp65504P2311SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2311SCounter != sharedCounter;
            localIp65504P2311SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2311_S_LEN = 2;
  	/**
	 * serializeIp65504P2311S
	 */
	protected void serializeIp65504P2311S(short ip65504P2311S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2311S,IP_65504_P_2311_S_LEN)
                  ,beginIp65504P2311S
                  ,IP_65504_P_2311_S_LEN
                 );
            localIp65504P2311SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2311SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2311S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2311S() {	 
			return (getShort(beginIp65504P2311S));
   	}
         int localIp65504P2311LCounter = -1;
         public boolean isIp65504P2311LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2311LCounter != sharedCounter;
            localIp65504P2311LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2311_L_LEN = 2;
  	/**
	 * serializeIp65504P2311L
	 */
	protected void serializeIp65504P2311L(short ip65504P2311L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2311L,IP_65504_P_2311_L_LEN)
                  ,beginIp65504P2311L
                  ,IP_65504_P_2311_L_LEN
                 );
            localIp65504P2311LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2311LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2311L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2311L() {	 
			return (getShort(beginIp65504P2311L));
   	}
         int localIp65504P2312SCounter = -1;
         public boolean isIp65504P2312SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2312SCounter != sharedCounter;
            localIp65504P2312SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2312_S_LEN = 2;
  	/**
	 * serializeIp65504P2312S
	 */
	protected void serializeIp65504P2312S(short ip65504P2312S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2312S,IP_65504_P_2312_S_LEN)
                  ,beginIp65504P2312S
                  ,IP_65504_P_2312_S_LEN
                 );
            localIp65504P2312SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2312SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2312S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2312S() {	 
			return (getShort(beginIp65504P2312S));
   	}
         int localIp65504P2312LCounter = -1;
         public boolean isIp65504P2312LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2312LCounter != sharedCounter;
            localIp65504P2312LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2312_L_LEN = 2;
  	/**
	 * serializeIp65504P2312L
	 */
	protected void serializeIp65504P2312L(short ip65504P2312L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2312L,IP_65504_P_2312_L_LEN)
                  ,beginIp65504P2312L
                  ,IP_65504_P_2312_L_LEN
                 );
            localIp65504P2312LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2312LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2312L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2312L() {	 
			return (getShort(beginIp65504P2312L));
   	}
         int localIp65504P2313SCounter = -1;
         public boolean isIp65504P2313SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2313SCounter != sharedCounter;
            localIp65504P2313SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2313_S_LEN = 2;
  	/**
	 * serializeIp65504P2313S
	 */
	protected void serializeIp65504P2313S(short ip65504P2313S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2313S,IP_65504_P_2313_S_LEN)
                  ,beginIp65504P2313S
                  ,IP_65504_P_2313_S_LEN
                 );
            localIp65504P2313SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2313SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2313S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2313S() {	 
			return (getShort(beginIp65504P2313S));
   	}
         int localIp65504P2313LCounter = -1;
         public boolean isIp65504P2313LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2313LCounter != sharedCounter;
            localIp65504P2313LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2313_L_LEN = 2;
  	/**
	 * serializeIp65504P2313L
	 */
	protected void serializeIp65504P2313L(short ip65504P2313L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2313L,IP_65504_P_2313_L_LEN)
                  ,beginIp65504P2313L
                  ,IP_65504_P_2313_L_LEN
                 );
            localIp65504P2313LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2313LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2313L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2313L() {	 
			return (getShort(beginIp65504P2313L));
   	}
         int localIp65504P2314SCounter = -1;
         public boolean isIp65504P2314SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2314SCounter != sharedCounter;
            localIp65504P2314SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2314_S_LEN = 2;
  	/**
	 * serializeIp65504P2314S
	 */
	protected void serializeIp65504P2314S(short ip65504P2314S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2314S,IP_65504_P_2314_S_LEN)
                  ,beginIp65504P2314S
                  ,IP_65504_P_2314_S_LEN
                 );
            localIp65504P2314SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2314SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2314S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2314S() {	 
			return (getShort(beginIp65504P2314S));
   	}
         int localIp65504P2314LCounter = -1;
         public boolean isIp65504P2314LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2314LCounter != sharedCounter;
            localIp65504P2314LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2314_L_LEN = 2;
  	/**
	 * serializeIp65504P2314L
	 */
	protected void serializeIp65504P2314L(short ip65504P2314L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2314L,IP_65504_P_2314_L_LEN)
                  ,beginIp65504P2314L
                  ,IP_65504_P_2314_L_LEN
                 );
            localIp65504P2314LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2314LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2314L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2314L() {	 
			return (getShort(beginIp65504P2314L));
   	}
         int localIp65504P2315SCounter = -1;
         public boolean isIp65504P2315SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2315SCounter != sharedCounter;
            localIp65504P2315SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2315_S_LEN = 2;
  	/**
	 * serializeIp65504P2315S
	 */
	protected void serializeIp65504P2315S(short ip65504P2315S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2315S,IP_65504_P_2315_S_LEN)
                  ,beginIp65504P2315S
                  ,IP_65504_P_2315_S_LEN
                 );
            localIp65504P2315SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2315SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2315S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2315S() {	 
			return (getShort(beginIp65504P2315S));
   	}
         int localIp65504P2315LCounter = -1;
         public boolean isIp65504P2315LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2315LCounter != sharedCounter;
            localIp65504P2315LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2315_L_LEN = 2;
  	/**
	 * serializeIp65504P2315L
	 */
	protected void serializeIp65504P2315L(short ip65504P2315L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2315L,IP_65504_P_2315_L_LEN)
                  ,beginIp65504P2315L
                  ,IP_65504_P_2315_L_LEN
                 );
            localIp65504P2315LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2315LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2315L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2315L() {	 
			return (getShort(beginIp65504P2315L));
   	}
         int localIp65504P2316SCounter = -1;
         public boolean isIp65504P2316SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2316SCounter != sharedCounter;
            localIp65504P2316SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2316_S_LEN = 2;
  	/**
	 * serializeIp65504P2316S
	 */
	protected void serializeIp65504P2316S(short ip65504P2316S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2316S,IP_65504_P_2316_S_LEN)
                  ,beginIp65504P2316S
                  ,IP_65504_P_2316_S_LEN
                 );
            localIp65504P2316SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2316SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2316S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2316S() {	 
			return (getShort(beginIp65504P2316S));
   	}
         int localIp65504P2316LCounter = -1;
         public boolean isIp65504P2316LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2316LCounter != sharedCounter;
            localIp65504P2316LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2316_L_LEN = 2;
  	/**
	 * serializeIp65504P2316L
	 */
	protected void serializeIp65504P2316L(short ip65504P2316L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2316L,IP_65504_P_2316_L_LEN)
                  ,beginIp65504P2316L
                  ,IP_65504_P_2316_L_LEN
                 );
            localIp65504P2316LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2316LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2316L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2316L() {	 
			return (getShort(beginIp65504P2316L));
   	}
         int localIp65504P2317SCounter = -1;
         public boolean isIp65504P2317SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2317SCounter != sharedCounter;
            localIp65504P2317SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2317_S_LEN = 2;
  	/**
	 * serializeIp65504P2317S
	 */
	protected void serializeIp65504P2317S(short ip65504P2317S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2317S,IP_65504_P_2317_S_LEN)
                  ,beginIp65504P2317S
                  ,IP_65504_P_2317_S_LEN
                 );
            localIp65504P2317SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2317SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2317S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2317S() {	 
			return (getShort(beginIp65504P2317S));
   	}
         int localIp65504P2317LCounter = -1;
         public boolean isIp65504P2317LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2317LCounter != sharedCounter;
            localIp65504P2317LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2317_L_LEN = 2;
  	/**
	 * serializeIp65504P2317L
	 */
	protected void serializeIp65504P2317L(short ip65504P2317L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2317L,IP_65504_P_2317_L_LEN)
                  ,beginIp65504P2317L
                  ,IP_65504_P_2317_L_LEN
                 );
            localIp65504P2317LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2317LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2317L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2317L() {	 
			return (getShort(beginIp65504P2317L));
   	}
         int localIp65504P2318SCounter = -1;
         public boolean isIp65504P2318SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2318SCounter != sharedCounter;
            localIp65504P2318SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2318_S_LEN = 2;
  	/**
	 * serializeIp65504P2318S
	 */
	protected void serializeIp65504P2318S(short ip65504P2318S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2318S,IP_65504_P_2318_S_LEN)
                  ,beginIp65504P2318S
                  ,IP_65504_P_2318_S_LEN
                 );
            localIp65504P2318SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2318SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2318S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2318S() {	 
			return (getShort(beginIp65504P2318S));
   	}
         int localIp65504P2318LCounter = -1;
         public boolean isIp65504P2318LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2318LCounter != sharedCounter;
            localIp65504P2318LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2318_L_LEN = 2;
  	/**
	 * serializeIp65504P2318L
	 */
	protected void serializeIp65504P2318L(short ip65504P2318L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2318L,IP_65504_P_2318_L_LEN)
                  ,beginIp65504P2318L
                  ,IP_65504_P_2318_L_LEN
                 );
            localIp65504P2318LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2318LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2318L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2318L() {	 
			return (getShort(beginIp65504P2318L));
   	}
         int localIp65504P2319SCounter = -1;
         public boolean isIp65504P2319SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2319SCounter != sharedCounter;
            localIp65504P2319SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2319_S_LEN = 2;
  	/**
	 * serializeIp65504P2319S
	 */
	protected void serializeIp65504P2319S(short ip65504P2319S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2319S,IP_65504_P_2319_S_LEN)
                  ,beginIp65504P2319S
                  ,IP_65504_P_2319_S_LEN
                 );
            localIp65504P2319SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2319SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2319S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2319S() {	 
			return (getShort(beginIp65504P2319S));
   	}
         int localIp65504P2319LCounter = -1;
         public boolean isIp65504P2319LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2319LCounter != sharedCounter;
            localIp65504P2319LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2319_L_LEN = 2;
  	/**
	 * serializeIp65504P2319L
	 */
	protected void serializeIp65504P2319L(short ip65504P2319L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2319L,IP_65504_P_2319_L_LEN)
                  ,beginIp65504P2319L
                  ,IP_65504_P_2319_L_LEN
                 );
            localIp65504P2319LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2319LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2319L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2319L() {	 
			return (getShort(beginIp65504P2319L));
   	}
         int localIp65504P2320SCounter = -1;
         public boolean isIp65504P2320SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2320SCounter != sharedCounter;
            localIp65504P2320SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2320_S_LEN = 2;
  	/**
	 * serializeIp65504P2320S
	 */
	protected void serializeIp65504P2320S(short ip65504P2320S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2320S,IP_65504_P_2320_S_LEN)
                  ,beginIp65504P2320S
                  ,IP_65504_P_2320_S_LEN
                 );
            localIp65504P2320SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2320SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2320S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2320S() {	 
			return (getShort(beginIp65504P2320S));
   	}
         int localIp65504P2320LCounter = -1;
         public boolean isIp65504P2320LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2320LCounter != sharedCounter;
            localIp65504P2320LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2320_L_LEN = 2;
  	/**
	 * serializeIp65504P2320L
	 */
	protected void serializeIp65504P2320L(short ip65504P2320L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2320L,IP_65504_P_2320_L_LEN)
                  ,beginIp65504P2320L
                  ,IP_65504_P_2320_L_LEN
                 );
            localIp65504P2320LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2320LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2320L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2320L() {	 
			return (getShort(beginIp65504P2320L));
   	}
         int localIp65504P2321SCounter = -1;
         public boolean isIp65504P2321SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2321SCounter != sharedCounter;
            localIp65504P2321SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2321_S_LEN = 2;
  	/**
	 * serializeIp65504P2321S
	 */
	protected void serializeIp65504P2321S(short ip65504P2321S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2321S,IP_65504_P_2321_S_LEN)
                  ,beginIp65504P2321S
                  ,IP_65504_P_2321_S_LEN
                 );
            localIp65504P2321SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2321SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2321S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2321S() {	 
			return (getShort(beginIp65504P2321S));
   	}
         int localIp65504P2321LCounter = -1;
         public boolean isIp65504P2321LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2321LCounter != sharedCounter;
            localIp65504P2321LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2321_L_LEN = 2;
  	/**
	 * serializeIp65504P2321L
	 */
	protected void serializeIp65504P2321L(short ip65504P2321L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2321L,IP_65504_P_2321_L_LEN)
                  ,beginIp65504P2321L
                  ,IP_65504_P_2321_L_LEN
                 );
            localIp65504P2321LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2321LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2321L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2321L() {	 
			return (getShort(beginIp65504P2321L));
   	}
         int localIp65504P2322SCounter = -1;
         public boolean isIp65504P2322SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2322SCounter != sharedCounter;
            localIp65504P2322SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2322_S_LEN = 2;
  	/**
	 * serializeIp65504P2322S
	 */
	protected void serializeIp65504P2322S(short ip65504P2322S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2322S,IP_65504_P_2322_S_LEN)
                  ,beginIp65504P2322S
                  ,IP_65504_P_2322_S_LEN
                 );
            localIp65504P2322SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2322SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2322S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2322S() {	 
			return (getShort(beginIp65504P2322S));
   	}
         int localIp65504P2322LCounter = -1;
         public boolean isIp65504P2322LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2322LCounter != sharedCounter;
            localIp65504P2322LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2322_L_LEN = 2;
  	/**
	 * serializeIp65504P2322L
	 */
	protected void serializeIp65504P2322L(short ip65504P2322L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2322L,IP_65504_P_2322_L_LEN)
                  ,beginIp65504P2322L
                  ,IP_65504_P_2322_L_LEN
                 );
            localIp65504P2322LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2322LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2322L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2322L() {	 
			return (getShort(beginIp65504P2322L));
   	}
         int localIp65504P2323SCounter = -1;
         public boolean isIp65504P2323SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2323SCounter != sharedCounter;
            localIp65504P2323SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2323_S_LEN = 2;
  	/**
	 * serializeIp65504P2323S
	 */
	protected void serializeIp65504P2323S(short ip65504P2323S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2323S,IP_65504_P_2323_S_LEN)
                  ,beginIp65504P2323S
                  ,IP_65504_P_2323_S_LEN
                 );
            localIp65504P2323SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2323SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2323S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2323S() {	 
			return (getShort(beginIp65504P2323S));
   	}
         int localIp65504P2323LCounter = -1;
         public boolean isIp65504P2323LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2323LCounter != sharedCounter;
            localIp65504P2323LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2323_L_LEN = 2;
  	/**
	 * serializeIp65504P2323L
	 */
	protected void serializeIp65504P2323L(short ip65504P2323L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2323L,IP_65504_P_2323_L_LEN)
                  ,beginIp65504P2323L
                  ,IP_65504_P_2323_L_LEN
                 );
            localIp65504P2323LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2323LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2323L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2323L() {	 
			return (getShort(beginIp65504P2323L));
   	}
         int localIp65504P2324SCounter = -1;
         public boolean isIp65504P2324SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2324SCounter != sharedCounter;
            localIp65504P2324SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2324_S_LEN = 2;
  	/**
	 * serializeIp65504P2324S
	 */
	protected void serializeIp65504P2324S(short ip65504P2324S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2324S,IP_65504_P_2324_S_LEN)
                  ,beginIp65504P2324S
                  ,IP_65504_P_2324_S_LEN
                 );
            localIp65504P2324SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2324SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2324S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2324S() {	 
			return (getShort(beginIp65504P2324S));
   	}
         int localIp65504P2324LCounter = -1;
         public boolean isIp65504P2324LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2324LCounter != sharedCounter;
            localIp65504P2324LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2324_L_LEN = 2;
  	/**
	 * serializeIp65504P2324L
	 */
	protected void serializeIp65504P2324L(short ip65504P2324L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2324L,IP_65504_P_2324_L_LEN)
                  ,beginIp65504P2324L
                  ,IP_65504_P_2324_L_LEN
                 );
            localIp65504P2324LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2324LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2324L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2324L() {	 
			return (getShort(beginIp65504P2324L));
   	}
         int localIp65504P2325SCounter = -1;
         public boolean isIp65504P2325SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2325SCounter != sharedCounter;
            localIp65504P2325SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2325_S_LEN = 2;
  	/**
	 * serializeIp65504P2325S
	 */
	protected void serializeIp65504P2325S(short ip65504P2325S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2325S,IP_65504_P_2325_S_LEN)
                  ,beginIp65504P2325S
                  ,IP_65504_P_2325_S_LEN
                 );
            localIp65504P2325SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2325SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2325S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2325S() {	 
			return (getShort(beginIp65504P2325S));
   	}
         int localIp65504P2325LCounter = -1;
         public boolean isIp65504P2325LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2325LCounter != sharedCounter;
            localIp65504P2325LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2325_L_LEN = 2;
  	/**
	 * serializeIp65504P2325L
	 */
	protected void serializeIp65504P2325L(short ip65504P2325L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2325L,IP_65504_P_2325_L_LEN)
                  ,beginIp65504P2325L
                  ,IP_65504_P_2325_L_LEN
                 );
            localIp65504P2325LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2325LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2325L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2325L() {	 
			return (getShort(beginIp65504P2325L));
   	}




}
  
