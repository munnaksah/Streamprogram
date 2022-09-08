package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {
	public static void main(String[] args) {
		List<Country> cntry = new ArrayList<Country>();
		cntry.add(new Country("ABW", "Aruba", 78.4f));
		cntry.add(new Country("AFG", "Afghanistan", 45.9f));
		cntry.add(new Country("AGO", "Angola", 38.3f));
		cntry.add(new Country("AIA", "Anguilla", 76.1f));
		cntry.add(new Country("ALB", "Albania", 71.6f));
		cntry.add(new Country("AND", "Andorra", 83.5f));
		cntry.add(new Country("ANT", "Netherlands Antilles", 74.7f));
		cntry.add(new Country("ARE", "United Arab Emirates", 74.1f));
		cntry.add(new Country("ARG", "Argentina", 75.1f));
		cntry.add(new Country("ARM", "Armenia", 66.4f));

		List<Float> lifeExpList = new ArrayList<>();
		for (Country cnt : cntry) {
			if (cnt.lifeExpentency >= 76.0) {
				lifeExpList.add(cnt.lifeExpentency);
				System.out.println(cnt.code + " " + cnt.name + " " + cnt.lifeExpentency);
			}
		}

		System.out.println(lifeExpList);

		List<Float> lifeExpStrmList = cntry.stream().filter(c -> c.lifeExpentency >= 76.0f).map(c -> c.lifeExpentency)
				.collect(Collectors.toList());

		System.out.println(lifeExpStrmList);

		// 1st way

		System.out.println(" 1st way");
		cntry.stream().filter(c -> c.lifeExpentency >= 76.0f).forEach(c -> {
			System.out.println(c.code + " " + c.name + " " + c.lifeExpentency);
		});
		// 2nd Way
		System.out.println(" 2nd way");
		List<Country> lifeExpStrmCntrylist = cntry.stream().filter(c -> c.lifeExpentency >= 76.0f)
				.collect(Collectors.toList());
		// System.out.println(lifeExpStrmCntrylist);

		for (Country c : lifeExpStrmCntrylist) {
			System.out.println(c.code + " " + c.name + " " + c.lifeExpentency);
		}

	}

}
