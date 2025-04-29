package com.cloudframe.app.sf305120.dto;

/**
*  The class SvHeaderData282 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class SvHeaderData282 extends SvHeaderData282Serialized {
   

						@Getter @Setter private char[] svHeaderId282 = new char[2];

								@Getter @Setter private int svVersion282;

								@Getter @Setter private long svHdrLength282;

								@Getter @Setter private int svTlvLength282;
			@Getter @Setter private List<SvServiceTable282> svServiceTable282 = new ArrayList<>();
    	

						@Getter @Setter private char[] svFiller282 = new char[100];
	
	/**
	* Constructor for SvHeaderData282
	**/
    public SvHeaderData282() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < SV_SERVICE_TABLE_282_SIZE;arrayIndex++) {
						getSvServiceTable282().add(new SvServiceTable282(this, beginSvServiceTable282 + 
						arrayIndex * SvServiceTable282.getSvServiceTable282FieldLength()));
				}
	   	/*  end of offset */
								setSvHeaderId282(("SV").toCharArray());
								setSvVersion282(1);
								setSvHdrLength282(0L);
								setSvTlvLength282(0);
			for (int arrayIndex = 0; arrayIndex < SV_SERVICE_TABLE_282_SIZE;arrayIndex++) {
					getSvServiceTable282().add(new SvServiceTable282(this, beginSvServiceTable282 + 
						arrayIndex * SvServiceTable282.getSvServiceTable282FieldLength()));
			}
								setSvFiller282(pad(100," ".toCharArray(),' ',RIGHT_PAD));
    }





}
  
