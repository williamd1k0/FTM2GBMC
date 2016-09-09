/*
 * Copyright (C) 2016 Joseph El-Khouri
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package club.botb.savestate.ftm2gbmc;

import java.util.ArrayList;

/**
 *
 * @author Joseph El-Khouri
 */
public class FTMDPCMSample {
    
    private ArrayList<Byte> bytes;
    
    public FTMDPCMSample(ArrayList<Byte> bytes) {
        for (byte _byte : bytes)
            this.bytes.add(_byte);
    }
    
    public int getSize() {
        return bytes.size();
    }
    
    public byte getByte(int index) {
        return bytes.get(index);
    }
    
}
