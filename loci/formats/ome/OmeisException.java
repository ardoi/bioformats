//
// OmeisException.java
//

/*
OME Bio-Formats package for reading and converting biological file formats.
Copyright (C) 2005-@year@ UW-Madison LOCI and Glencoe Software, Inc.

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/

package loci.formats.ome;

/**
 * OmeisException is the exception thrown when something
 * goes wrong communicating with the OME Image Server (OMEIS).
 *
 * <dl><dt><b>Source code:</b></dt>
 * <dd><a href="https://skyking.microscopy.wisc.edu/trac/java/browser/trunk/loci/formats/ome/OmeisException.java">Trac</a>,
 * <a href="https://skyking.microscopy.wisc.edu/svn/java/trunk/loci/formats/ome/OmeisException.java">SVN</a></dd></dl>
 */
public class OmeisException extends Exception {

  public OmeisException() { super(); }
  public OmeisException(String s) { super(s); }
  public OmeisException(String s, Throwable cause) { super(s, cause); }
  public OmeisException(Throwable cause) { super(cause); }

}

