package api;

public class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;

			if (id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	public Member2 getMember2() {
		// TODO Auto-generated method stub
		return null;
	}

}