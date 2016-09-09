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
public class FTMMacro {
    
    private final int loop;
    private final int release;
    private final ArrayList<Integer> values;
    
    public FTMMacro(int loop, int release, ArrayList<Integer> values) {
        this.loop = loop;
        this.release = release;
        this.values = new ArrayList<>();
        for (int value : values)
            this.values.add(value);
    }
    
    public int getLoop() {
        return loop;
    }
    
    public int getRelease() {
        return release;
    }
    
    public int getValuesSize() {
        return values.size();
    }
    
    public int getValue(int index) {
        return values.get(index);
    }
    
}
