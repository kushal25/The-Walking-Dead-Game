 public interface WeaponState
{
    public void fire(); // potentially decrease ammo
    public void addAmmo(int ammo);
    public void addClip(int clip);
    public void reload();
}