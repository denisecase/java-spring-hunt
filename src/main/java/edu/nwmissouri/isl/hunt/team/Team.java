package edu.nwmissouri.isl.hunt.team;

public final class Team {

  private int id;
  private String name;

  // Empty constructor required
  public Team() {
  }

  public Team(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
      return "Team{" +
              "id='" + id + '\'' +
              ", name='" + name + '\'' +
              '}';
  }

  @Override
  public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Team team = (Team) o;
      return id == team.id &&  name.equals(team.name);
  }

  @Override
    public int hashCode() {
        int result = 31 * id + (name != null ? name.hashCode() : 0);
        return result;
    }


}
