package Java_OOP.InterfacesAndAbstraction.MilitaryElite;

import java.util.Collection;

public interface LieutenantGeneral extends Private{
    void addPrivate(Private priv);
    Collection<Private> getPrivates();
}
